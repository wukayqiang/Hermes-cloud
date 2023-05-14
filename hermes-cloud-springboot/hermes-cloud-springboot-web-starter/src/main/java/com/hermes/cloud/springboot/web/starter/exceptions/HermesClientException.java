package com.hermes.cloud.springboot.web.starter.exceptions;

import com.hermes.cloud.springboot.framework.exceptions.HermesException;

public class HermesClientException extends HermesException {

        private static final long serialVersionUID = 1L;

        public HermesClientException(int code, String message) {
            super(code, message);
        }

        public HermesClientException(int code, String message, Throwable e) {
            super(code, message, e);
        }

        public HermesClientException(String message) {
            super(message);
        }

        public HermesClientException(String message, Throwable e) {
            super(message, e);
        }

        public HermesClientException(Throwable e) {
            super(e);
        }
}
