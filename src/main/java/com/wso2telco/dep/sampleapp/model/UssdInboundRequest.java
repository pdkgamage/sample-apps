package com.wso2telco.dep.sampleapp.model;

public class UssdInboundRequest {

    private InboundUSSDMessageRequest inboundUSSDMessageRequest;

    public InboundUSSDMessageRequest getInboundUSSDMessageRequest() {
        return inboundUSSDMessageRequest;
    }

    public void setInboundUSSDMessageRequest(InboundUSSDMessageRequest inboundUSSDMessageRequest) {
        this.inboundUSSDMessageRequest = inboundUSSDMessageRequest;
    }

    public class InboundUSSDMessageRequest {
        private String address;
        private String sessionID;
        private String shortCode;
        private String keyword;
        private String inboundUSSDMessage;
        private String clientCorrelator;
        private String ussdAction;
        private ResponseRequest responseRequest;

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getSessionID() {
            return sessionID;
        }

        public void setSessionID(String sessionID) {
            this.sessionID = sessionID;
        }

        public String getShortCode() {
            return shortCode;
        }

        public void setShortCode(String shortCode) {
            this.shortCode = shortCode;
        }

        public String getKeyword() {
            return keyword;
        }

        public void setKeyword(String keyword) {
            this.keyword = keyword;
        }

        public String getInboundUSSDMessage() {
            return inboundUSSDMessage;
        }

        public void setInboundUSSDMessage(String inboundUSSDMessage) {
            this.inboundUSSDMessage = inboundUSSDMessage;
        }

        public String getClientCorrelator() {
            return clientCorrelator;
        }

        public void setClientCorrelator(String clientCorrelator) {
            this.clientCorrelator = clientCorrelator;
        }

        public String getUssdAction() {
            return ussdAction;
        }

        public void setUssdAction(String ussdAction) {
            this.ussdAction = ussdAction;
        }

        public ResponseRequest getResponseRequest() {
            return responseRequest;
        }

        public void setResponseRequest(ResponseRequest responseRequest) {
            this.responseRequest = responseRequest;
        }

        public class ResponseRequest {
            private String notifyURL;
            private String callbackData;
        }
    }


}