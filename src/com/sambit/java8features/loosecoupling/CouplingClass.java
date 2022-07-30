package com.sambit.java8features.loosecoupling;

public class CouplingClass {
    Job job;

    public CouplingClass(Job job) {
        this.job = job;
    }

    public void showData(){
        job.show();
    }
}
