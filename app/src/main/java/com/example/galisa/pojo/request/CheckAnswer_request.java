package com.example.galisa.pojo.request;


import java.util.List;

public class CheckAnswer_request {

    int setter_id;
    List<AnswerModel>list;

    public int getSetter_id() {
        return setter_id;
    }

    public void setSetter_id(int setter_id) {
        this.setter_id = setter_id;
    }

    public List<AnswerModel> getList() {
        return list;
    }

    public void setList(List<AnswerModel> list) {
        this.list = list;
    }

    public class AnswerModel {
        int id;
        String answer;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getAnswer() {
            return answer;
        }

        public void setAnswer(String answer) {
            this.answer = answer;
        }
    }
}
