package com.sayan.android.codejampractice;

public class IndividualAudience {
    private int shynessLevel;
    private boolean isClapping ;

    public IndividualAudience(int shynessLevel) {
        this.shynessLevel = shynessLevel;
        this.isClapping = false;
    }

    public int getShynessLevel() {
        return shynessLevel;
    }

    public void setShynessLevel(int shynessLevel) {
        this.shynessLevel = shynessLevel;
    }

    public boolean isClapping() {
        return isClapping;
    }

    public void setClapping(boolean clapping) {
        isClapping = clapping;
    }

    @Override
    public String toString() {
        return "Shy: " + shynessLevel + ", Clapping? " + (isClapping?"YES":"NO");
    }
}
