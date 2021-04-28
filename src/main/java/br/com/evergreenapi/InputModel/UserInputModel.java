package br.com.evergreenapi.InputModel;

import br.com.evergreenapi.Domain.Gender;

public class UserInputModel {
    private String name;
    private String email;
    private String password;
    private String confirmPassword;
    private String birthday;
    private Gender gender;
    private String passwordTips;
    private Boolean active;
    private String avatar;
    private String nickname;
    private String WhatYouThinking;
    private Boolean supportRecycling;
    private Boolean buyProducts;
    private Boolean sellProducts;


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return this.confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getBirthday() {
        return this.birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Gender getGender() {
        return this.gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getPasswordTips() {
        return this.passwordTips;
    }

    public void setPasswordTips(String passwordTips) {
        this.passwordTips = passwordTips;
    }

    public Boolean getActive() {
        return this.active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getAvatar() {
        return this.avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getNickname() {
        return this.nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getWhatYouThinking() {
        return this.WhatYouThinking;
    }

    public void setWhatYouThinking(String WhatYouThinking) {
        this.WhatYouThinking = WhatYouThinking;
    }

    public Boolean getSupportRecycling() {
        return this.supportRecycling;
    }

    public void setSupportRecycling(Boolean supportRecycling) {
        this.supportRecycling = supportRecycling;
    }

    public Boolean getBuyProducts() {
        return this.buyProducts;
    }

    public void setBuyProducts(Boolean buyProducts) {
        this.buyProducts = buyProducts;
    }

    public Boolean getSellProducts() {
        return this.sellProducts;
    }

    public void setSellProducts(Boolean sellProducts) {
        this.sellProducts = sellProducts;
    }
}
