c++ = c + OOPs
used where high performance and precise control over memory is required.


### writing c++ code:
- step 1: define problem
- step 2: design a solution
- step 3: write a program
- step 4: compile the program
- step 5: link object files
- step 6: test program

#### compiling: 
- checks code to make sure it follows the rules of the c++ code.
- converts code to machine level language and outputs a *.o/obj file

#### linking:
- linker's job is to combine all obj files and produce desired o/p file
- read all .obj file's and make sure they are valid.
- ensures all cross-file dependencies are resolved properly. if linker is unable to connect a reference to something with its definition, you'll get linker error.
- linker also links library files.
- o/p a executable file.

### Structure

- statements: causes program to perform some action.
- functions: collection of statements that get executed sequentially
- name of function, object, type, etc. is identifier.

### Object: 
An object is used to store a value in memory. A variable is an object that has a name (identifier). Naming our objects let us refer to those objects again later in the program. In general programming, the term object typically refers to an unnamed object in memory, a variable, or a function. In C++, the term object has a narrower definition that excludes functions.

- definition: A definition statement can be used to tell the compiler that we want to use a variable in our program.
- List-initialization is generally preferred over the other initialization forms because it works in most cases (and is therefore most consistent), it disallows narrowing conversions (which we normally don’t want), and it supports initialization with a list of values (something we’ll cover in a future lesson).
```
    [[maybe_unused]] double pi { 3.14159 };  // Don't complain if pi is unused
    [[maybe_unused]] double gravity { 9.8 }; // Don't complain if gravity is unused
    [[maybe_unused]] double phi { 1.61803 }; // Don't complain if phi is unused
```

