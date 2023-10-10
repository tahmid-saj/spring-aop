package com.luv2code.aopdemo.dao;

import org.springframework.stereotype.Repository;

@Repository
public class MembershipDAOImpl implements MembershipDAO {

    @Override
    public void addAccount() {
        System.out.println(getClass() + ": Doing my DB work, adding a membership");
    }

    @Override
    public void goToSleep() {
        System.out.println(getClass() + ": Going to sleep");

    }
}
