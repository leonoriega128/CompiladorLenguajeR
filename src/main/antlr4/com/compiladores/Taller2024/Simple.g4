//Encabezado donde se especifica el nombre de la gramatica

grammar Simple;

@parser::header{
	import java.util.Map;
	import java.util.HashMap;
	
}

@parser::members{
	Map<String,Object> symbolTable=new HashMap<String, Object>();
}

// Analizador Sintactico
// Empieza la Gramatica Libre de Contexto
// Simbolo Inicial : program

texto: sentence* FIN;

sentence:  asignacion | compare | suma | factorial | rev | max |min | sort |
			 si | load;
// Producciones
asignacion: ID IGUAL NUMBER ;
compare: NUMBER OPERACIONES NUMBER;
factorial: FACTORIAL PARENTABRE NUMBER PARENTCIE
	{System.out.println("Realizando el factorial de un numero");};
unique:UNIQUE PARENTABRE ID PARENTCIE;


suma returns [int value]: 
    SUMA PARENTABRE n1=NUMBER COMAC n2=NUMBER PARENTCIE
    {
        $value = Integer.parseInt($n1.text) + Integer.parseInt($n2.text);
        System.out.println("Sumando dos números: " + $n1.text + " + " + $n2.text + " = " + $value);
    };
rev:REV PARENTABRE ID PARENTCIE; 
max returns [Object value]: MAX PARENTABRE ID {$value = $ID.text;} PARENTCIE;
min: MIN PARENTABRE ID  PARENTCIE;
sort: SORT PARENTABRE ID PARENTCIE;  
si: IF PARENTABRE (ID|NUMBER)+ (OPERACIONES (ID|NUMBER))* PARENTCIE LLAVEABRE sentence+ LLAVECIE (ELSE LLAVEABRE sentence+ LLAVECIE)?;
load: ID ASIGN LOAD PARENTABRE NUMBER (COMAC NUMBER)* PARENTCIE ; 
OPERACIONES: (MAYOR|MAYORIGUAL|MENOR|MENORIGUAL|IGUAL);

// Termina la gramatica libre de Contexto




// Empieza la gramatica Regular
// Simbolos Terminales
// Tokens esta formado por una cadena de caracteres que lo identifica de manera unica y una expresion regular.


// Tokens para palabras reservadas
IF: 'if';
ELSE:'else';
SUMA:'suma';
FACTORIAL: 'factorial';
GRANDE:'grande';
LOAD: 'load';
MULTIVEC:'multiplicacion_numero_vector';
MAX:'max';
MIN:'min';
SORT:'sort';
REV:'rev';
UNIQUE:	'unique';
SUBSET:'subset';

// Tokens para operadores aritmeticos 


//Tokens Operadores Logicos

AND:'&&';
OR:'||';
NOT: '!';

//Tokens Operadores de comparacion

IGUAL:'=';
MENOR:'<';
MAYOR: '>';	
MAYORIGUAL:'>=';
MENORIGUAL:'<=';

ASIGN:'<-';

// Tokens de signos de puntuacion

LLAVEABRE:'{';
LLAVECIE: '}';
PARENTABRE:'(';
PARENTCIE:')';
COMAC:',';


NUMBER:[0-9]+;
ID: [a-zA-Z]+ NUMBER*;


FIN: '#';
COMMENT: '//';
// Token white space (espacio en blanco)

// skip
WS:	[ \t\r\n]+ -> skip; 