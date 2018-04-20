# prj_adr_matdesign2

## Curso Material Design con Android Studio - Jesús Conde

1. [02.- Curso Material Design con Android Studio. El Theme Material](https://youtu.be/MSL1HZaY0GU)
    1. [Definir estilo personalizado para text view](https://youtu.be/MSL1HZaY0GU?t=206)
        1. [New value resource file](https://youtu.be/MSL1HZaY0GU?t=225)
        2. [explicacion DP](https://youtu.be/MSL1HZaY0GU?t=270)
        3. [explicacion SP](https://youtu.be/MSL1HZaY0GU?t=280)
        4. [aplicando estilo personalizado al textview aplicando `style="@style/stlUno"`](https://youtu.be/MSL1HZaY0GU?t=308)
    2. [aplicando nuestros propios colores](https://youtu.be/MSL1HZaY0GU?t=400)
        1. [editar archivo `values/colors.xml`](https://youtu.be/MSL1HZaY0GU?t=413)
    3. [aplicando estilos a toda la app](https://youtu.be/MSL1HZaY0GU?t=435)
        1. [Se edita el archivo `values/styles.xml` que es el contiene `<style name="AppTheme"`](https://youtu.be/MSL1HZaY0GU?t=463)
    4. [https://www.materialpalette.com](https://www.materialpalette.com)
2. [03.- Material Design con Android Studio. Entender los Layouts](https://www.youtube.com/watch?v=PLBPxB8DBRI)
    1. [Activities = Pantallas,Apariencia=xml,Comportamiento=.java](https://youtu.be/PLBPxB8DBRI?t=27)
    2. [Componente de pantalla - Widgets](https://youtu.be/PLBPxB8DBRI?t=57)
        1. Botones, imagenes, deslizadores
    3. [Componente de pantalla - Contenedores](https://youtu.be/PLBPxB8DBRI?t=71)
        1. Los contenedores son los layouts o viewgroups
        2. [Relative Layout](https://youtu.be/PLBPxB8DBRI?t=116)
            1. Gestiona la rotacion en pantalla y ahorra memoria en diseños complejos
        3. [Linear Layout](https://youtu.be/PLBPxB8DBRI?t=212)
            1. Pensado para usar una única columna o única fila o lista
            2. Cada linear layout tiene un atributo `android:orientation` que puede tomar Horizontal o Vertical
            3. Se puede crear diseños complejos anidando linear layouts
        4. [Ejemplo component tree](https://youtu.be/PLBPxB8DBRI?t=249)
3. [04.- Curso Material Design con Android Studio. Crear Aplicación con Material Design.](https://www.youtube.com/watch?v=npph-aRU30U)
    1. [RecyclerView remplaza a ListView](https://youtu.be/npph-aRU30U?t=74)
    2. []()
    2. []()
    2. []()
    
### Notas
- Para cambiar la version del sdk hay que tocar el archivo `app/build.gradle` propiedad `minSdkVersion`
  [ejemplo](https://github.com/eacevedof/prj_adr_matdesign2/commit/bb0ffb41697834e541047005d17b261c0d5e8a4f)
- Corregido error:
  `Error: This view is not constrained, it only has design time positions, so it will jump to (0,0) unless you add constraints`
  Habia que darle a la varita mágica.
  
## [Curso Android desde cero (nov - 2017)](https://www.youtube.com/watch?v=tyx05coXixw&list=PLyvsggKtwbLX06iMtXnRGX5lyjiiMaT2y) - [La Geekpedia De Ernesto](https://www.youtube.com/user/neto376/videos?flow=grid&view=0&sort=dd)

1. [Curso Android desde cero #6 | Ciclo de vida de un Activity](https://youtu.be/poipVVd2jzU?list=PLyvsggKtwbLX06iMtXnRGX5lyjiiMaT2y&t=2)