package com.example.android3_hw32;

import java.util.ArrayList;

public class UsersList {
    Integer page, per_page, total, total_pages;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPer_page() {
        return per_page;
    }

    public void setPer_page(Integer per_page) {
        this.per_page = per_page;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getTotal_pages() {
        return total_pages;
    }

    public void setTotal_pages(Integer total_pages) {
        this.total_pages = total_pages;
    }

    ArrayList<DataClass> data;
    SupportClass support;

    public ArrayList<DataClass> getData() {
        return data;
    }

    public void setData(ArrayList<DataClass> data) {
        this.data = data;
    }

    public SupportClass getSupport() {
        return support;
    }

    public void setSupport(SupportClass support) {
        this.support = support;
    }

   public class DataClass {
        String id, email, first_name, second_name, avatar;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getFirst_name() {
            return first_name;
        }

        public void setFirst_name(String first_name) {
            this.first_name = first_name;
        }

        public String getSecond_name() {
            return second_name;
        }

        public void setSecond_name(String second_name) {
            this.second_name = second_name;
        }

        public String getAvatar() {
            return avatar;
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }
    }

    class SupportClass {
        String url, text;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }
    }

}
