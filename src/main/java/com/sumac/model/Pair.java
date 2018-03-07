package com.sumac.model;

/**
 * @author Pavel Putrenkov
 * @version 1.0
 *
 */
public  class Pair {
    public final int first;
    public final int second;

    public Pair(int first, int second) {
        super();
        this.first = first;
        this.second = second;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + first;
        result = prime * result + second;
        return result;
    } // hashCode

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pair other = (Pair) obj;
        return first == other.first && second == other.second;
    } // equals

    @Override
    public String toString() {
        return "(" + this.first + ", " + this.second + ")";
    } // toString


}
