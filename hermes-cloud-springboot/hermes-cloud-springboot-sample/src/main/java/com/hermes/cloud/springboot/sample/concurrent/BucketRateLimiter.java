package com.hermes.cloud.springboot.sample.concurrent;

public class BucketRateLimiter {
    /**
     * TPS 每秒并发数
     */
    private final Long rate;
    private final Long bucketSize;
    private Long lastTokenTime;
    private Long currentBucketSize;

    public BucketRateLimiter(long rate, long bucketSize) {
        this.rate = rate;
        this.bucketSize = bucketSize;
        this.currentBucketSize = bucketSize;
    }

    public long getLastTokenTime() {
        return lastTokenTime;
    }

    public void setLastTokenTime(long lastTokenTime) {
        this.lastTokenTime = lastTokenTime;
    }

    public long getCurrentBucketSize() {
        return currentBucketSize;
    }

    public void setCurrentBucketSize(long currentBucketSize) {
        this.currentBucketSize = currentBucketSize;
    }

    @Override
    public String toString() {
        return "RateLimiter{" + "lastTokenTime=" + lastTokenTime + ", currentBucketSize=" + currentBucketSize + '}';
    }

    public synchronized boolean acquireToken() {
        long currentTime = System.currentTimeMillis();
        if (lastTokenTime == null) {
            lastTokenTime = System.currentTimeMillis();
        }
        long timeGap = currentTime - lastTokenTime;
        long tokenGap = (timeGap * rate) / 1000;
        if (tokenGap + currentBucketSize > 0) {
            if (tokenGap > 0) {
                lastTokenTime = currentTime;
            }
            if (tokenGap + currentBucketSize > bucketSize) {
                currentBucketSize = bucketSize;
            } else {
                currentBucketSize = tokenGap + currentBucketSize - 1;
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args) throws InterruptedException {
        BucketRateLimiter bucketRateLimiter = new BucketRateLimiter(1, 10);
        while (true) {
            System.out.println(bucketRateLimiter.acquireToken());
            System.out.println(bucketRateLimiter.toString());
            Thread.sleep(100);
        }

    }
}
