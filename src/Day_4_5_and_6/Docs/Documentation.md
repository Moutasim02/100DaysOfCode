# The idea
- The server is constantly listening to connections of clients.
- accept connections
- open new connection handler for each client

## Server class
- implements Runnable: The Runnable interface should be implemented by any class whose instances are intended to be executed by a thread. [only one method available: run() ]
## Client class 
- implements Runnable: The Runnable interface should be implemented by any class whose instances are intended to be executed by a thread. [only one method available: run() ]

## Imported classes explanation:
- BufferedReader: Reads text from a character-input stream
- IOException: This class is the general class of exceptions produced by failed or interrupted I/O operations.
- PrintWriter: Prints formatted representations of objects to a text-output stream.
- ServerSocket: waits for requests to come in over the network and returns the results.
- Socket:  is an endpoint for communication between two machines
- InputStreamReader: It reads bytes and decodes them into characters
- Executor: An object that executes submitted Runnable tasks
- Executors: Factory and utility methods for Executor, ExecutorService, etc.
