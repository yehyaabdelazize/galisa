package com.example.galisa.pojo.response;

public class SignUp_response {


    /**
     * data : {"id":56,"first_name":null,"last_name":null,"user_name":"1111","email":"1111","passwods":"1111","phone":"1111","state":"parent","image":null,"gender":null,"firebase_token":null,"created_at":"2020-02-23 14:58:50","updated_at":"2020-02-23 05:58:51"}
     * error : 0
     * message : regesteration success
     */

    private DataBean data;
    private int error;
    private String message;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

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

    public static class DataBean {
        /**
         * id : 56
         * first_name : null
         * last_name : null
         * user_name : 1111
         * email : 1111
         * passwods : 1111
         * phone : 1111
         * state : parent
         * image : null
         * gender : null
         * firebase_token : null
         * created_at : 2020-02-23 14:58:50
         * updated_at : 2020-02-23 05:58:51
         */

        private int id;
        private Object first_name;
        private Object last_name;
        private String user_name;
        private String email;
        private String passwods;
        private String phone;
        private String state;
        private Object image;
        private Object gender;
        private Object firebase_token;
        private String created_at;
        private String updated_at;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Object getFirst_name() {
            return first_name;
        }

        public void setFirst_name(Object first_name) {
            this.first_name = first_name;
        }

        public Object getLast_name() {
            return last_name;
        }

        public void setLast_name(Object last_name) {
            this.last_name = last_name;
        }

        public String getUser_name() {
            return user_name;
        }

        public void setUser_name(String user_name) {
            this.user_name = user_name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPasswods() {
            return passwods;
        }

        public void setPasswods(String passwods) {
            this.passwods = passwods;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public Object getImage() {
            return image;
        }

        public void setImage(Object image) {
            this.image = image;
        }

        public Object getGender() {
            return gender;
        }

        public void setGender(Object gender) {
            this.gender = gender;
        }

        public Object getFirebase_token() {
            return firebase_token;
        }

        public void setFirebase_token(Object firebase_token) {
            this.firebase_token = firebase_token;
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
