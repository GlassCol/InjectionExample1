package org.injection.example;

public class Phone {
    private String mob;

    public String getMob() {
        return mob;
    }

    public Phone(String mob) {
        this.mob = mob;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "# - '" + mob + '\'' +
                '}';
    }
}
