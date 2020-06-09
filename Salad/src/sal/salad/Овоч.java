package sal.salad;

import java.util.Objects;

public abstract class Овоч {
    public String назва;
    public int калорійність;

    public Овоч(String назва, int калорійність) throws IllegalArgumentException {
        if (калорійність <= 0) throw new IllegalArgumentException("Калорійність не може бути менша за 0");
        this.назва = назва;
        this.калорійність = калорійність;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Овоч овоч = (Овоч) o;
        return калорійність == овоч.калорійність && Objects.equals(назва, овоч.назва);
    }

    @Override
    public int hashCode() {
        return Objects.hash(назва, калорійність);
    }

    @Override
    public String toString() {
        return "Овоч{" + "назва='" + назва + '\'' + ", калорійність=" + калорійність + '}';
    }
}
