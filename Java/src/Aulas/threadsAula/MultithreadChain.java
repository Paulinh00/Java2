package Aulas.threadsAula;

public class MultithreadChain { //classe principal q cria a thread 1
    public static void main(String[] args) {
        Thread t = new Thread(new ChainThread(1));
        t.start();
    }

    static class ChainThread implements Runnable {  // runnable fala oq cada theread deve fazer
        private int threadId;                       //inicia cada instancia com um id unico para cada theread

        public ChainThread(int threadId) {
            this.threadId = threadId;
        }

        @Override                                   // subscreve
        public void run() {
            Thread nextThread = null;
            if (threadId < 50) {
                nextThread = new Thread(new ChainThread(threadId + 1));
                nextThread.start();
            }

            if (nextThread != null) {
                try {
                    nextThread.join();  // Espera a próxima thread terminar
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            // Exibe a mensagem após a thread que ela criou terminar
            System.out.println("Ola da thread " + threadId);
        }
    }
}
