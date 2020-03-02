package com.example.galisa.pojo.response;

import java.util.List;

public class Info_response {


    /**
     * data :[{"id":"2","user_id":"34","age":"1-2","date":"2020-02-27","time":"5","price":"300","total_price":null,"description":"df dhjh fkjdshkfdskjhhdsfjk dksh fskh kjh","child_state":null,"handicap_type":null,"created_at":"2020-02-12 01:15:11","updated_at":"2020-02-11 23:15:11"}]
     * error : 0
     * message : show my orders
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
         * id : 2
         * user_id : 34
         * age : 1-2
         * date : 2020-02-27
         * time : 5
         * price : 300
         * total_price : null
         * description : df dhjh fkjdshkfdskjhhdsfjk dksh fskh kjh
         * child_state : null
         * handicap_type : null
         * created_at : 2020-02-12 01:15:11
         * updated_at : 2020-02-11 23:15:11
         */

        private String id;
        private String user_id;
        private String age;
        private String date;
        private String time;
        private String price;
        private Object total_price;
        private String description;
        private Object child_state;
        private Object handicap_type;
        private String created_at;
        private String updated_at;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getUser_id() {
            return user_id;
        }

        public void setUser_id(String user_id) {
            this.user_id = user_id;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public Object getTotal_price() {
            return total_price;
        }

        public void setTotal_price(Object total_price) {
            this.total_price = total_price;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public Object getChild_state() {
            return child_state;
        }

        public void setChild_state(Object child_state) {
            this.child_state = child_state;
        }

        public Object getHandicap_type() {
            return handicap_type;
        }

        public void setHandicap_type(Object handicap_type) {
            this.handicap_type = handicap_type;
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
