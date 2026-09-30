package com.mitienda.inventario.model;

import java.math.BigDecimal;

/**
 * Clase que representa un Producto dentro del sistema de inventario.
 */
public class Producto {

    // Atributos privados
    private Long idProducto;
    private String codigoBarras;
    private String nombre;
    private String categoria;
    private BigDecimal precioCompra;
    private BigDecimal precioVenta;
    private int stockActual;
    private int stockMinimo;

    // Constructor vacío (necesario para frameworks de persistencia como JPA/Hibernate)
    public Producto() {
    }

    // Constructor completo para instanciar productos con todos sus datos
    public Producto(Long idProducto, String codigoBarras, String nombre, String categoria, 
                    BigDecimal precioCompra, BigDecimal precioVenta, int stockActual, int stockMinimo) {
        this.idProducto = idProducto;
        this.codigoBarras = codigoBarras;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.stockActual = stockActual;
        this.stockMinimo = stockMinimo;
    }

    // --- GETTERS Y SETTERS ---

    public Long getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Long idProducto) {
        this.idProducto = idProducto;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public BigDecimal getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(BigDecimal precioCompra) {
        this.precioCompra = precioCompra;
    }

    public BigDecimal getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(BigDecimal precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getStockActual() {
        return stockActual;
    }

    public void setStockActual(int stockActual) {
        this.stockActual = stockActual;
    }

    public int getStockMinimo() {
        return stockMinimo;
    }

    public void setStockMinimo(int stockMinimo) {
        this.stockMinimo = stockMinimo;
    }

    // Método de utilidad para verificar fácilmente si el producto necesita reabastecimiento
    public boolean requiereReabastecimiento() {
        return this.stockActual <= this.stockMinimo;
    }

    // Representación en formato texto del objeto (ideal para pruebas y logs)
    @Override
    public String toString() {
        return "Producto{" +
                "idProducto=" + idProducto +
                ", codigoBarras='" + codigoBarras + '\'' +
                ", nombre='" + nombre + '\'' +
                ", categoria='" + categoria + '\'' +
                ", precioCompra=" + precioCompra +
                ", precioVenta=" + precioVenta +
                ", stockActual=" + stockActual +
                ", stockMinimo=" + stockMinimo +
                '}';
    }
}