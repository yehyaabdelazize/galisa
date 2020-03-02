package com.example.galisa.pojo.response;

import java.util.List;

public class Check_response {

    /**
     * data : [{"id":5,"question":"لماذا تريد هذه الوظيفه؟","created_at":"2020-02-12 06:52:21","updated_at":"2020-02-12 06:52:21"},{"id":6,"question":"كم عمرك؟","created_at":"2020-02-12 06:52:21","updated_at":"2020-02-12 06:52:21"},{"id":7,"question":"هل لديك خبره في هذا المجال","created_at":"2020-02-12 06:52:21","updated_at":"2020-02-23 00:03:49"},{"id":8,"question":"ادخل رقمك القومي","created_at":"2020-02-12 06:52:21","updated_at":"2020-02-12 06:52:21"},{"id":9,"question":"أضف نبذه عن نفسك؟","created_at":"2020-02-12 06:52:21","updated_at":"2020-02-12 06:52:21"}]
     * error : 0
     * message : show questions data successfully
     */

    private int error;
    private String message;
    private List<DataBean> data;

    public int getError() {
        return error;
    }

    public void setError(int error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * id : 5
         * question : لماذا تريد هذه الوظيفه؟
         * created_at : 2020-02-12 06:52:21
         * updated_at : 2020-02-12 06:52:21
         */

        private int id;
        private String question;
        private String created_at;
        private String updated_at;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getQuestion() {
            return question;
        }

        public void setQuestion(String question) {
            this.question = question;
        }

        public String getCreated_at() {
            return created_at;
        }

        public void setCreated_at(String created_at) {
            this.created_at = created_at;
        }

        public String getUpdated_at() {
            return updated_at;
        }

        public void setUpdated_at(String updated_at) {
            this.updated_at = updated_at;
        }
    }
}
