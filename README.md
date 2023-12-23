# HGroups Package v1.1: Ennead Update
Notes on HGroups Package:




About:

Each Instance can hold up to a maximum of what their Class names entail of any Object combinatoions:    

Pair- 2 <br />
Triad- 3<br />
Tetrad - 4<br />
Pentad- 5<br />
Hexad- 6<br />
Heptad- 7 <br />
Octad- 8 <br />
Ennead- 9 <br />
...

A Tetrad can either be created directly (4 Objects) or a merge of 2 Pairs (denoted as pair1 and pair2)
The merge happens with contents of pair1 being added as data and data 2 and pair2 contents as data3 and data4 .
code: new Tetrad(data, data2, data3, data4) "or" new Tetrad(pair1, pair2)

A Pentad can either be created directly (5 Objects) or a merge of 1 Triad and 1 Pairs (denoted as triad and pair)
The merge happens with contents of triad being added as data, data2, and data3 and pair contents as data4 and data5 .
code: new Pentad(data, data2, data3, data4, data5) "or" new Pentad(triad, pair)




get(X data)

All get(X data) and retrieve(int i) methods require either seperate assignment to a variable or casting before usage.

get creates a Tuple rank lower of the other elements Ex:

Triad<Integer, String, Book> triadExample = new Triad(1, "Hello World,", Book(title));
traidExample.get("Hello Wold") would result in a pair containing (Y)(1, Book(title))

Pair get(int i) returns the other data in the pair:
pair.get(1) would result in (Y)(Book(title))

Type Y is a generic type that is to return any data type hence why casting or pre-storage(assign to a variable) is necessary for use.


printing the group: printGroup()

the print method creates an f string of elements of the tuple and prints it to consoles. If custom Object, the print
method will print objectType and memory location. As of this version(1.0) there is no method to custom print.
