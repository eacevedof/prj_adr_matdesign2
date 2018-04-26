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
    2. Aplico redondeo en 2 posiciones
    3. Cambio de this.log a this.alert(sText)
    4. Uso la clase Color.<CONSTANTE>
    
12. [Curso Android desde cero #12 | Hardcoded string should use string resource](https://www.youtube.com/watch?v=HTc0owuahqg&list=PLyvsggKtwbLX06iMtXnRGX5lyjiiMaT2y&index=13)    
    1. [`res\values\strings.xml`](https://youtu.be/HTc0owuahqg?list=PLyvsggKtwbLX06iMtXnRGX5lyjiiMaT2y&t=124)
    2. Aislando los textos en el archivo string. name patron: prefijo-componente.id-sin-prefijo.propiedad
    
13. [Curso Android desde cero #13 | Controles RadioGroup y RadioButton](https://www.youtube.com/watch?v=mKkOZ5Z5mtY)    
    1. [RadioGroup y RadioButtons](https://youtu.be/mKkOZ5Z5mtY?t=183)
        1. [RadioGroup y layout_height:wrap_content - el efecto que tiene](https://youtu.be/mKkOZ5Z5mtY?t=282)

14. [Curso Android desde cero #14 | Parte lógica de los controles RadioGroup y RadioButton](https://www.youtube.com/watch?v=aI5FCr85fOc)
    1. [`private RadioButton`](https://youtu.be/aI5FCr85fOc?t=178)

15. [Curso Android desde cero #15 | Ejercicio práctico con RadioGroup y RadioButton](https://www.youtube.com/watch?v=YzwDpid3nVY)
    1. Radios con cuatro operaciones.
    
16. [Curso Android desde cero #16 | Parte lógica del ejercicio practico con RadioGroup y RadioButton](https://www.youtube.com/watch?v=67PmTreN0KI&t=5s)

17. [Curso Android desde cero #17 | Control CheckBox en Android Studio](https://www.youtube.com/watch?v=3Sx92S6Vs98&t=2s)
    1.[CheckBox](https://youtu.be/3Sx92S6Vs98?t=125)

18. [Curso Android desde cero #18 | Control Spinner en Android Studio](https://www.youtube.com/watch?v=dp_ruQOP1sU&t=4s)
    1. Es como el elemento select en html
    2. [Configurando ArrayAdapter para cargar spinner](https://youtu.be/dp_ruQOP1sU?t=845)
    3. `oSpinner.getSelectedItem().toString();`

19. [Curso Android desde cero #19 | Cómo personalizar un Spinner en Android Studio](https://www.youtube.com/watch?v=rCT7EDJ3em4)
    1. [Configurar "elemento" spinner xml](https://youtu.be/rCT7EDJ3em4?t=178)
    2. [R.layout.<nombre-archivo-xml>](https://youtu.be/rCT7EDJ3em4?t=555)
        1. `//ArrayAdapter <String> oAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,arOpciones);
            ArrayAdapter <String> oAdapter = new ArrayAdapter<String>(this,R.layout.spinner_item_geekpedia,arOpciones);`

20. [Curso Android desde cero #20 | Control ListView en Android Studio equivalente a un "grid" en móvil](https://www.youtube.com/watch?v=0Aoz5F_pkkg)
    1. No se pq he tenido que usar la varita mágica, no se pq se superponia el textview sobre el listview
    2. [`oListView.setOnItemClickListener(new OnI)` Clase Anónima](https://youtu.be/0Aoz5F_pkkg?t=1071)
    
21. [Curso Android desde cero #21 | Control ImageButton en Android Studio](https://www.youtube.com/watch?v=VRSWRvYeKTc)
    1. Son botones a los que se les asocia una imagen. Seria algo como:`<a href=""><img src=""/></a>` 
    2. Es recomendable si se van a personalizar imagenes para botones que cumplan con un tamaño max de 50x50 px
    3. El nombre de las imagenes tiene que estar en minusculas sino puede dar errror
    4. Para incluir una imagen al proyecto hay que pegarla en la carpeta `app/res/minmap`
    5. Despues de tener el archivo dentro de `res` cuando añadamos un boton tipo imagen y nos muestre el dialogo de selección en la
       parte `Drawable` aparecera como disponible
    6. La propiedad `contentDescription` es obligatoria llenarla. Es una simple descripcion orientativa. No aparecera en ningun sitio.
    7. Ese texto hay que añadirlo al archivo `strings.xml` 
      
### Notas
- `Emulator: FB: openColorBuffer cb handle 0x2d5 not found`
    - No he encontrado solución para esto
    