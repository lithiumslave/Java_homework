package lesson8HomeWork;

import java.util.Objects;

public class Chair {
    private int height;
    private String material;

    public Chair (int height, String material) {
        this.height = height;
        this.material = material;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chair chair = (Chair) o;
        return height == chair.height && Objects.equals(material, chair.material);
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, material);
    }
}
