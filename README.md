# AlMundo
Dessarrollo almundo

1. Se crean dos  colas una  cola para la recepción de las llamadas y otra cola para la disponibilidad de los agentes

2. La primera  cola se crear con el fin de no generar congestión en la recepción de las llamadas y evitar que se pierdan 
llamadas en los momentos picos de entrada de llamadas

3. Todas las llamadas entran primero a una cola, la cual se encarga de gestionarlas para ser enviadas después a cada uno 
de los agentes

4. Se hace un ejercicio con dos hilos para probar la sobrecarga de las llamadas en la pila de recepción.

5. En la pila de agentes  se cargan los 10 agentes disponiles se asume que son 10 agentes ya que el sistema solo puede atender
10 llamadas en paralelo, estos agentes entan distribuidos entre (Operadores, Supervisores y Director)

6. Se creac tres tipos de actores cada uno correspondiente a un tipo de  agente, la idea del uso de actores es  garantizar 
la escalabilidad y el crecimiento del sistema en el momento en que sea necesario  aumentar e pull de llamadas entrantes
y la cantidad de agentes del sistema
