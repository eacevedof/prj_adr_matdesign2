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
    4. Para incluir una imagen al proyecto hay que pegarla en la carpeta `app/res/minmap` que es una carpeta para iconos
    5. Despues de tener el archivo dentro de `res` cuando añadamos un boton tipo imagen y nos muestre el dialogo de selección en la
       parte `Drawable` aparecera como disponible
    6. La propiedad `contentDescription` es obligatoria llenarla. Es una simple descripcion orientativa. No aparecera en ningun sitio.
    7. Ese texto hay que añadirlo al archivo `strings.xml` 
    
22. [Curso Android desde cero #22 | Control EditText validación de campos en Android Studio](https://www.youtube.com/watch?v=hjd3Kd7FDmc&list=PLyvsggKtwbLX06iMtXnRGX5lyjiiMaT2y&index=22)
    1. Nuevos campos tipo EditText
        1. Plain Text = textPersonName
        2. Password = textPassword
    2. Ejemplo
    ```java
        String sNombre = edtNombre.getText().toString();
        String sPassword = edtPassword.getText().toString();
    ``` 
    
23. [Curso Android desde cero #23 | Cómo pasar de una Activity a otra - Intent en Android](https://www.youtube.com/watch?v=VQcJRM6ZgHw&index=23&list=PLyvsggKtwbLX06iMtXnRGX5lyjiiMaT2y)
    1. Por cada cambio de pantalla hay que inicializar una nueva activity.
    2. Con este fin se debe usar un objeto intent: [`Intent oI = new Intent():`](https://youtu.be/VQcJRM6ZgHw?list=PLyvsggKtwbLX06iMtXnRGX5lyjiiMaT2y&t=13)
        1. Parámetros `Intent`: `Intent oI = new Intent(oThisCurrentActivity,ActivityInstanciar.class);`
        2. Ejecutar la llamada: [`startActivit(oI);`](https://youtu.be/VQcJRM6ZgHw?list=PLyvsggKtwbLX06iMtXnRGX5lyjiiMaT2y&t=68)
    3. [Creando código de llamada. Metodo: `public void Siguiente(view oView)`](https://youtu.be/VQcJRM6ZgHw?list=PLyvsggKtwbLX06iMtXnRGX5lyjiiMaT2y&t=464)
    4. Obteniendo el nombre de la clase: [`.class`](https://youtu.be/VQcJRM6ZgHw?list=PLyvsggKtwbLX06iMtXnRGX5lyjiiMaT2y&t=600)
        1. [Explicación - Stackoverflow](https://stackoverflow.com/questions/15078935/what-does-class-mean-in-java)
        2. 
        ```java
            .class is used when there isn't an instance of the class available. 
            .getClass() is used when there is an instance of the class available.
            object.getClass() returns the class of the given object        
        ```
30. [Curso Android desde cero #30 | Base de datos - Altas (SQLite) en Android](https://www.youtube.com/watch?v=TxkdWX3UaNk)
    1. `android.database.sqlite.SQLiteOpenHelper` CLASE para conectar con sqlite
        1. [Heredando de SQLiteOpenHelper](https://youtu.be/TxkdWX3UaNk?t=341)
    2. Hay que crear una clase que conecta heredando de la clase anterior. Por ejemplo: `class AdminSQLiteOpenHelper`
    3. La clase hija se debe crear como Java Class en java/<paquete-generado-por-la-app/
    4. Despues de escribir la clase al lado de extends presionamos alt+enter, a continuacion seleccionaremos implementar methods
    5. Esto generara 2 metodos: [`onCreate(oSqliteDatabase):void y onUpgrade(oSqliteDatabase):int`](https://youtu.be/TxkdWX3UaNk?t=384)
        1. [`onCreate()`](https://youtu.be/TxkdWX3UaNk?t=494)
        2. Ruta de la base de datos: `/data/data/<your_package_name>/databases`
        3. [Ruta en el emulador - stackoverflow](https://stackoverflow.com/questions/1510840/where-does-android-emulator-store-sqlite-database) 
        4. Android Studio: `View->Tools Windows->Device File Explorer + <la ruta anterior>`
    6. Continua con error. Esto es pq tambien hay que heredar el constructor. ctrl+enter Create constructor match super
    7. Hay que seleccionar el constructor con 4 parámetros.
    8. Donde se guarda la bd sqlite?
    9. Se puede crear una bd sin el helper e incluirla en la app?
    
31. [Curso Android desde cero #31 | Base de datos – Consultas (SQLite) en Android](https://www.youtube.com/watch?v=TxkdWX3UaNk)
    1. `public void buscar(View oView)` 
    2. `oDb = new ComponentDB(this,"db_framework",null,1);`
    3. `SQLiteDatabase oDbRW = oDb.getWritableDatabase();`
    4. `Cursor oCursor = oDbRW.rawQuery(sSQL,null);`
    5. `oCursor.close()`

32. [Curso Android desde cero #32 | Base de datos – Bajas (SQLite) en Android](https://www.youtube.com/watch?v=C7A9ULyBX5Y)    
    1. `public void borrar(View oView){`
    2. `int iCantidad = oDbRW.delete("articulos","codigo="+sCodigo,null);`
    3. `oDbRW.close();`

33. [Curso Android desde cero #33 | Base de datos – Modificaciones (SQLite) en Android](https://www.youtube.com/watch?v=hq9ASTujqO4)
    1. `public void modificar(View oView){`
    2. `int iCantidad = oDbRW.update("articulos",oContVal,"codigo="+sCodigo,null);`

<hr />

### Notas
- Version de la app: API 24: Android 7.0 (Nougat)

- `Emulator: FB: openColorBuffer cb handle 0x2d5 not found`
    - No he encontrado solución para esto
    
- `strings.xml`:
    - Creo que es mejor: &#x3C;tipo&#x3E;.&#x3C;propiedad&#x3E;.&#x3C;id&#x3E; Piensatelo!
    - `edt.codigo.hint`
    - `rdb.4.text`
    - `tvw.resultado.text`
    - `but.modificar.text`
    
- Estaba dando un error de excepcion el el metodo buscar. Era pq la bd estaba mal creada
  he tenido que eliminarla fisicamente a traves del `Device File Explorer`, desinstalando la app y
  borrando el archivo `db_framework`
  
- Cuando se crea una carpeta con `File oFile = new File(sPathBase,sFolder)` 
se crea en `/sdcard/<nueva_carpeta>`
    - Creo que para esto es necesario habilitar permisos de escritura en la instalación
    - Para permitir la escritura es necesario entrar en el dispositivo `settings->app permissions->myapp->sotrage=on`
    
- Despues de crear una actividad `MaterialDesign` ha empezado a dar error en Gradle.
  Era:
```
implementation 'com.android.support:design:27.0.2'
implementation 'com.android.support:design:27.1.1' nuevo
```
Se mostraba lo siguiente:`Error program type already present android support design widget coordinator..`
Puede que tenga que ver más con la creacion de la nueva actividad que con la actualizacion de Android Studio

```bash
Enviroment.DIRECTORY_DOCUMENTS                          ->  Documents
this.getExternalFilesDir(Environment.DIRECTORY_DOCUMENTS)-> /storage/emulated/0/Android/data/es.theframework.matdesign/files/Documents
Environment.getExternalStorageDirectory().toString()    ->  /storage/emulated/0
Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM) -> /storage/emulated/0/DCIM
Context.getExternalMediaDirs().toString()               ->  [Ljava.io.File;@84f7dd2
this.getFilesDir().toString()                           -> /data/user/0/es.theframework.matdesign/files


```
- [Comprobar permisos sobre la sdcard](https://stackoverflow.com/questions/33162152/storage-permission-error-in-marshmallow)
    - En el dispositivo, settings, la-app, permissions, activar el permiso
- Error:
    - Necesito saber como puedo evitar que se llame dos veces a la misma actividad, es decir una vez que
    llamo a una actividad cancelar una posterior llamada si esta esta en proceso de rendereizado.
    - Quizas Intervenga [esto, ciclo de vida](https://pbs.twimg.com/media/DdPGaKjX4AAZsZi.jpg):
    - [Stackoverflow - Posible solucion](https://stackoverflow.com/questions/8077728/how-to-prevent-the-activity-from-loading-twice-on-pressing-the-button)
    