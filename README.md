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
  
<hr/>  
  
## [Curso Android desde cero (nov - 2017)](https://www.youtube.com/watch?v=tyx05coXixw&list=PLyvsggKtwbLX06iMtXnRGX5lyjiiMaT2y) - [La Geekpedia De Ernesto](https://www.youtube.com/user/neto376/videos?flow=grid&view=0&sort=dd)

6. [Curso Android desde cero #6 | Ciclo de vida de un Activity](https://youtu.be/poipVVd2jzU?list=PLyvsggKtwbLX06iMtXnRGX5lyjiiMaT2y&t=2)
    1. Eventos:
        - [Imagen con el esquema de eventos](https://youtu.be/poipVVd2jzU?list=PLyvsggKtwbLX06iMtXnRGX5lyjiiMaT2y&t=34)
        - `onCreate()`
            - `onRestart()`
        - `onStart()`
        - `onResume()`
        - `actividad ejecutandose`
        - `actividad entra en primer plano`
        - `onPause()`
        - `onStop()` --> `onRestart()`
        - `actividad terminandose o en destrucción`
        - `onDestroy()`
        - `actividad cerrada`
7. [Curso Android desde cero #7 | Debuggeo de aplicaciones en Android Studio](https://www.youtube.com/watch?v=k9rOy-qH_rY&list=PLyvsggKtwbLX06iMtXnRGX5lyjiiMaT2y&index=8)
    1. Debug simple con Mayus+F9 y F7,F8...

8. [Curso Android desde cero #8 | Mensajes emergentes en Android con la clase Toast](https://www.youtube.com/watch?v=ZeBlrtQAmN0&list=PLyvsggKtwbLX06iMtXnRGX5lyjiiMaT2y&index=9)
    1. Toast es como el console.log(...) o alert(...) en js.
    
9. [Curso Android desde cero #9 | Mi primer Aplicación en Android - Diseño gráfico](https://www.youtube.com/watch?v=gH7aV28H1Os&index=10&list=PLyvsggKtwbLX06iMtXnRGX5lyjiiMaT2y)
    1. Ejemplo calculadora.
    2. Medida **SP** Scale-Independent Pixels
        1. [Explicacion](http://jonsegador.com/2012/09/diferentes-unidades-de-medida-disponibles-en-android-dp-sp-pt-px-mm-in/)
        
10. [Curso Android desde cero #10 | Mi primer Aplicación en Android - Diseño lógico](https://www.youtube.com/watch?v=v1zbFY4Kmtk&index=11&list=PLyvsggKtwbLX06iMtXnRGX5lyjiiMaT2y)        
    1. Aplicando codigo a la clase MainActivity.java que controle la app anterior
    2. [Explicación de la clase view como argumento en la funcion Sumar(..)](https://youtu.be/v1zbFY4Kmtk?list=PLyvsggKtwbLX06iMtXnRGX5lyjiiMaT2y&t=966)
    3. [Warning - Aplicando distancia entre componente superior y el margen superior del main layout](https://youtu.be/v1zbFY4Kmtk?list=PLyvsggKtwbLX06iMtXnRGX5lyjiiMaT2y&t=1501)
    4. [Warning - Hardcoded text](https://youtu.be/v1zbFY4Kmtk?list=PLyvsggKtwbLX06iMtXnRGX5lyjiiMaT2y&t=1562)

11. [Curso Android desde cero #11 | Ejercicio práctico (Aplicación móvil)](https://www.youtube.com/watch?v=Ml9hPWd2SCM&index=12&list=PLyvsggKtwbLX06iMtXnRGX5lyjiiMaT2y)    
    1. [Compatibilidad con API15 IceCreamSandwich pq? por ser 100% compatible](https://youtu.be/Ml9hPWd2SCM?list=PLyvsggKtwbLX06iMtXnRGX5lyjiiMaT2y&t=142)
    
    
### Notas
- `Emulator: FB: openColorBuffer cb handle 0x2d5 not found`
    - No he encontrado solución para esto
    