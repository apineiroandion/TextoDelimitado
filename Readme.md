# Exercicio 8
## textodelimitado
graba nun ficheiro de texto delimitado mediante os metodos print e println da clase PrintWriter ,
os contidos dos tres arrays seguintes tendo en conta que cada tres elementos que  ocupan
a mesma posicion nos arrays representan a os campos dun rexistro dunha taboa de produtos,
onde cada produto ten un codigo unha descricion e un prezo:
String[] cod={"p1","p2","p3"};
String[] desc ={"parafusos","cravos","tachas"};
int[] prezo ={3,4,5};

    Ten en conta que debes usar como separadores de campo  tabuladores : \t
     e que os separadores de rexistros deben ser  retornos de linea : o metodo println(argumento)
     da clase PrintWriter (BufferedWriter(FileWriter(File)) convirte o argumento nunha  cadea de
     texto e inclue un cambio de linea ao final
      
     Despois de grabados ditos valores debes voltalos a ler rexistro a rexisto  mediante ao metodo readLine() da clase BufferedReader , á cal lle pasamos como parametro a clase FilerReader 
	Cada vez que leas unha linea do ficheiro debes pasar  os valores de cada campo  a un array mediante a funcion de cadea "split()" e imprimir ditos valores por separado coma se amosa ao final deste enunciado
	
	o fin do ficheiro detectase cando o metodo readLine() devolta un null.
	
       Débese investigar na interede como usar a funcion de cadea split para separar os valores dun ha cadea

opcional: se observas o resultado impreso veras que os precios estan escritos co simbolo €   Podes investigar como facer isto (hai varios xeitos de facelo. Pista:  tes a clase NumberFormat que ten o metodo getCurrencyInstance() que te permite crear un obxecto NumberFormat con formato monetario , co cal podes dar formato monetario a un numero

Resultado da lectura:

Codigo:        p1
Descricion: parafusos
Prezo:       3,00 €

Codigo:        p2
Descricion: cravos
Prezo:       4,00 €

Codigo:        p3
Descricion: tachas
Prezo:       5,00 €

  