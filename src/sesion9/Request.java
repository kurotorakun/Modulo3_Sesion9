package sesion9;

/**
 * Created by mcarvajal on 24/05/2017.
 */
public @interface Request{      // Creo una  anotación  propia, extendiendo un interface con prefijo @:
    int id();                   //  declaro id.
    int batch() default 1;      //  creo que estaría mal declarado. ¿ Se te ocurre como hacerlo?
    String process() default "[unassigned]";    // declaro procces, con valor default.
    String date();              // declaro date.
}

