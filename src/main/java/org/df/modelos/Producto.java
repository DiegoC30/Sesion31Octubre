package org.df.modelos;



public class Producto {
    private String nombre;
    private int precio;
    private int cantidadDisponible;

    public Producto(String nombre, int precio, int cantidadDisponible) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadDisponible = cantidadDisponible;
    }

    public Producto() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    public void actualizarCantidad(int cantidad) {
        this.cantidadDisponible += cantidad;
    }

    public int calcularValorTotal() {
        return this.precio * this.cantidadDisponible;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", cantidadDisponible=" + cantidadDisponible +
                ", valorTotal=" + calcularValorTotal() +
                '}';
    }

    public static void main(String[] args) {
        Producto producto = new Producto("Laptop", 1000, 5);
        System.out.println(producto);
    }
}
