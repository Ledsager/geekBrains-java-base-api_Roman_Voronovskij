package ru.geekbrains.java.base.api.lesson2.task4.model;

public class Vector {
    private double x;
    private double y;
    private double z;

    public Vector() {
    }

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return "Vector(" + x + ", " + y + " , " + z + ");";
    }

    /**
     * @return длинну вектора
     */
    public double vectorLength() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    /**
     * @return скалярное произведение
     */
    public double vectorScal(Vector vector) {
        return x * vector.x + y * vector.y + z * vector.z;
    }

    /**
     * @return векторное произведение
     */
    public Vector vectorProduct(Vector vector) {
        return new Vector(
                y * vector.z - z * vector.y,
                z * vector.x - x * vector.z,
                x * vector.y - y * vector.x);
    }

    /**
     * @return косинус угла
     */
    public double vectorCos(Vector vector) {
        return vectorScal(vector) / (vectorLength() * vector.vectorLength());
    }

    /**
     * @return сумму векторов
     */
    public Vector vectorSum(Vector vector) {
        return new Vector(
                x + vector.x,
                y + vector.y,
                z + vector.z
        );

    }

    /**
     * @return разность векторов
     */
    public Vector vectorDiff(Vector vector) {
        return new Vector(
                x - vector.x,
                y - vector.y,
                z - vector.z
        );
    }

    /**
     * @param n - оличество элементов
     * @return массиив векторов
     */
    public static Vector[] vectorRandom(int n) {
        Vector[] mass = new Vector[n];
        for (int i = 0; i < n; i++) {
            mass[i] = new Vector(
                    Math.random(),
                    Math.random(),
                    Math.random());
        }
        return mass;
    }
}
