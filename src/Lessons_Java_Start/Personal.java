package Lessons_Java_Start;

public class Personal {
    private String nik;
    private int i;

    public Personal(String nik, int i) {
        this.nik = nik;
        this.i = i;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Personal personal = (Personal) o;

        if (i != personal.i) return false;
        return nik != null ? nik.equals(personal.nik) : personal.nik == null;
    }

    @Override
    public int hashCode() {
        int result = nik != null ? nik.hashCode() : 0;
        result = 31 * result + i;
        return result;
    }

    public String getNik() {

        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

}
