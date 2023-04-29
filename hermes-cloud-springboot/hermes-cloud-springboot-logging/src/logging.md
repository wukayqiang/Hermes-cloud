# 日志系统设计
## 日志客户端
### 日志客户端功能清单
- [ ] 日志敏感信息脱敏
- [ ] 标准化日志输出格式
- [ ] 支持日志输出到文件中
- [ ] 支持日志输出到控制台
- [ ] 支持异步日志打印
- [ ] 支持logback和log4j2两种日志框架
- [ ] 动态可调整的日志级别

### 标准化日志格式输出
日志格式如下：
```json
{
  "topic":"%topic",
  "logtime":"%d{yyyy-MM-dd HH:mm:ss.SSS}",
  "level":"%level",
  "thread":"%thread",
  "logger":"%logger{36}",
  "traceId":"%X{traceId}",
  "spanId":"%spanId",
  "parentId":"%parentId",
  "line":%line,
  "appVersion":"%appVersion",
  "uid":"%uid",
  "msg":%msg,
  "context":"${APP_NAME}",
  "nodeIP":"${HOST_IP}",
  "serverIP":"${SERVER_IP}",
  "clusterName":"${CLUSTER_NAME}",
  "stackTrace":%exception,
  "timestamp":%longTime,
  "msgLength":%msgLength
}
```
### 日志敏感信息脱敏
