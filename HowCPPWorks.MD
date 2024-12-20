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

### I/O:
- std::cout is buffered
- std::endl: it outputs a newline (moving the cursor to the next line of the console), and it flushes the buffer (which is slow).
- std::cin is buffered because it allows us to separate the entering of input from the extract of input. We can enter input once and then perform multiple extraction requests on it.

### Operators
- The number of operands that an operator takes as input is called the operator’s arity.
- Both operator= and operator<< (when used to output values to the console) return their left operand. Thus, x = 5 returns x, and std::cout << 5 returns std::cout.


### functions
- A function is a reusable sequence of statements designed to do a particular job.
- The function initiating the function call is the caller, and the function being called (executed) is the callee. A function call is also sometimes called an invocation, with the caller invoking the callee.
- It is a common misconception that main is always the first function that executes. Global variables are initialized prior to the execution of main. If the initializer for such a variable invokes a function, then that function will execute prior to main.
- Variables defined inside the body of a function are called local variables
-  Local variables are destroyed in the opposite order of creation at the end of the set of curly braces in which it is defined (or for a function parameter, at the end of the function).
```
int add(int x, int y)
{
    int z{ x + y };

    return z;
} // z, y, and x destroyed here
```
### preprocessor code:
#include
#define
#if
#endif