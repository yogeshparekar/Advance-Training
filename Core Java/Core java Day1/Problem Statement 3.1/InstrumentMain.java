package Problem_Statement3_1;

abstract class Instrument {
public abstract void Play();
}

class Piano extends Instrument {
@Override public void Play() {
System.out.println("Piano is playing tan tan tan tan");
}
}

class Flute extends Instrument {
@Override public void Play() {
System.out.println("Flute is playing toot toot toot toot ");
}
}

class Guitar extends Instrument {
@Override public void Play() {
System.out.println("Guitar is playing tin tin tin");
}
}

class InstrumentMain {
public static void main(String args[]) {
Instrument A[] = new Instrument[10];
for (int iLoop=0; iLoop<10; iLoop++) {
switch (iLoop%3)
{
case 0: { A[iLoop] = new Piano(); break; }
case 1: { A[iLoop] = new Flute(); break; }
case 2: { A[iLoop] = new Guitar(); break; }
}
} 

for (int iLoop=0; iLoop<10; iLoop++) {
System.out.println("------------------------------------");
System.out.println(" object # " + (iLoop+1));
A[iLoop].Play();
if (A[iLoop] instanceof Piano) { System.out.println("Piano"); }
if (A[iLoop] instanceof Flute) { System.out.println("Flute"); }
if (A[iLoop] instanceof Guitar) { System.out.println("Guitar"); }
}
}
}