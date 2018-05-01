package Lessons_Java_Start.serializable;

import java.io.Serializable;

public class User implements Serializable {

    transient int lifeLevel;
    static int staticField;
    transient Sord sord;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (lifeLevel != user.lifeLevel) return false;
        return sord.equals(user.sord);
    }

    @Override
    public int hashCode() {
        int result = lifeLevel;
        result = 31 * result + sord.hashCode();
        return result;
    }
}
