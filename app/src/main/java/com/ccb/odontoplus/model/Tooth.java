package com.ccb.odontoplus.model;

public class Tooth {

    private String number;
    private boolean top = false;
    private boolean bottom = false;
    private boolean right = false;
    private boolean left = false;
    private boolean center = false;

    private ToothState state =  ToothState.PRESENT;

    public Tooth(String number) {
        this.number = number;
    }

    public boolean isTop() {
        return top;
    }

    public void setTop(boolean top) {
        this.top = top;
    }

    public boolean isBottom() {
        return bottom;
    }

    public void setBottom(boolean bottom) {
        this.bottom = bottom;
    }

    public boolean isRight() {
        return right;
    }

    public void setRight(boolean right) {
        this.right = right;
    }

    public boolean isLeft() {
        return left;
    }

    public void setLeft(boolean left) {
        this.left = left;
    }

    public boolean isCenter() {
        return center;
    }

    public void setCenter(boolean center) {
        this.center = center;
    }

    public ToothState getState() {
        return state;
    }

    public void setState(ToothState state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Tooth tooth = (Tooth) o;

        return this.number.equals(tooth.number);
    }

    @Override
    public int hashCode() {
        return this.number.hashCode();
    }
}
