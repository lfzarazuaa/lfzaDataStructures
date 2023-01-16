package DataStructures.Definitions.Linear.p05_HashTables;

import java.util.Objects;

public class Pair {
    private int n1;
    private int n2;

    public Pair(int n1, int n2) {
        if (n1<=n2){
            this.n1=n1;
            this.n2=n2;
        }
        else {
            this.n1=n2;
            this.n2=n1;
        }
    }

    public int getN1() {
        return n1;
    }

    public int getN2() {
        return n2;
    }

    public void setPair(int n1,int n2) {
        if (n1<=n2){
            this.n1=n1;
            this.n2=n2;
        }
        else {
            this.n1=n2;
            this.n2=n1;
        }
    }

    @Override
    public String toString() {
        return "(" + n1 +
                ", " + n2 +
                ')';
    }

    @Override
    public int hashCode() {
        return Objects.hash(n1, n2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair pair = (Pair) o;
        return n1 == pair.n1 &&
                n2 == pair.n2;
    }
}
