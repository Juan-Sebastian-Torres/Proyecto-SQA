#author: Juan Sebastian Torres RIncón
# language: es

Característica: Abrir una pàgina web


  @successful
  Escenario: Seleccionar dos productos de la categoría amor para agregarlos al carro de compras
    Dado "Juan" abre la pagina web de prueba
    Cuando seleccionar el primer producto
    Y seleccionar el segundo producto
    Entonces visualizara el carrito de compras