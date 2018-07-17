package com.epam.hw.one;

public class Developer extends Employee {
    private String currentProject;
    private String githubName;

    public void setCurrentProject(String currentProject){
        this.currentProject=currentProject;
    }

    public void setGithubName(String githubName){
        this.githubName=githubName;
    }

    public String getCurrentProject(){
        return  currentProject;
    }

    public String getGithubName(){
        return  githubName;
    }

    @Override
    public String toString(){
        return super.toString() + "\nPosition: " + getClass().getName() + "\nCurrent project: " + getCurrentProject() + "\nGitHub name: " + getGithubName();
    }
}
