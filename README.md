# ÍNDICE

<ul>
<li><a href='#introduccion'>Introducción</a></li>
<li><a href='#manual'>Manual</a></li>
<li><a href='#metodologia'>Metodología</a></li>
<li><a href='#diseno'>Diseño</a></li>

---

## <div id='introduccion'>Introducción</div>

Adrián González González - <a href='https://github.com/Adriceka'>@Adriceka</a>

Este proyecto consiste en la creación de un tipo **enum en Java** llamado <strong>Arnold</strong>, donde se representan los planetas del sistema solar junto con sus características principales como la masa y el radio.

El programa permite calcular el peso de una persona en distintos planetas en función de la gravedad y además incluye pruebas unitarias para validar su funcionamiento.

---

## <div id='manual'>Manual</div>

#### Instalación

Para ejecutar este proyecto necesitas:

<ul>
<li>Java 21</li>
<li>Maven</li>
</ul>

Clonamos el repositorio:

git clone https://github.com/Adriceka/ArnoldEnumType.git

Accedemos a la carpeta:

cd ArnoldEnumType

#### Compilación

mvn clean compile

#### Ejecución

El programa principal muestra el peso en distintos planetas:

mvn exec:java

#### Tests

Para ejecutar los tests unitarios:

mvn test

---

## <div id='metodologia'>Metodología</div>

Para realizar este proyecto se siguieron los siguientes pasos:

<ol>
<li>
Se definió el enum <strong>Planeta</strong> con:
<ul>
<li>Constantes para cada planeta.</li>
<li>Atributos: masa y radio.</li>
</ul>
</li>
<br/>

<li>
Se implementaron métodos para cálculos físicos:
<ul>
<li><strong>gravedadSuperficial()</strong></li>
<li><strong>masaHumano()</strong></li>
<li><strong>pesoSuperficie()</strong></li>
</ul>
</li>
<br/>

<li>
Se añadieron métodos de clasificación:
<ul>
<li>Planetas terrestres.</li>
<li>Gigantes gaseosos.</li>
<li>Gigantes helados.</li>
</ul>
</li>
<br/>

<li>
Se desarrolló la clase <strong>ArnoldMain</strong>:
<ul>
<li>Recorre todos los planetas con <strong>Planeta.values()</strong>.</li>
<li>Calcula el peso en cada planeta.</li>
<li>Muestra resultados por tipo de planeta.</li>
</ul>
</li>
<br/>

<li>
Se implementaron tests unitarios utilizando <strong>JUnit 5</strong> y <strong>AssertJ</strong>.
</li>
</ol>

---

## <div id='diseno'>Diseño</div>

El diseño del proyecto es sencillo y organizado:

<ul>

<li>
<strong>Uso de enum</strong>:
<ul>
<li>Se utiliza un enum para representar un conjunto fijo de planetas.</li>
<li>Cada planeta tiene atributos como masa y radio.</li>
</ul>
</li>
<br/>

<li>
<strong>Métodos implementados</strong>:
<ul>
<li><strong>getMasa()</strong>: devuelve la masa del planeta.</li>
<li><strong>getRadio()</strong>: devuelve el radio del planeta.</li>
<li><strong>gravedadSuperficial()</strong>: calcula la gravedad.</li>
<li><strong>masaHumano()</strong>: calcula la masa de una persona.</li>
<li><strong>pesoSuperficie()</strong>: calcula el peso en el planeta.</li>
</ul>
</li>
<br/>

<li>
<strong>Clase principal</strong>:
<ul>
<li>La clase <strong>ArnoldMain</strong> contiene el método main.</li>
<li>Utiliza bucles <strong>for</strong> para recorrer los planetas.</li>
<li>Muestra los resultados por consola.</li>
</ul>
</li>
<br/>

<li>
<strong>Tests</strong>:
<ul>
<li>Se comprueba el funcionamiento del enum.</li>
<li>Se validan métodos como <strong>getMasa()</strong> y <strong>getRadio()</strong>.</li>
<li>Se verifica el cálculo del peso en planetas.</li>
<li>Se testean los conjuntos de planetas (terrestres y gaseosos).</li>
</ul>
</li>
<br/>

<li>
<strong>Simplicidad</strong>:
<ul>
<li>El código se ha desarrollado de forma sencilla para facilitar su comprensión.</li>
</ul>
</li>

</ul>
