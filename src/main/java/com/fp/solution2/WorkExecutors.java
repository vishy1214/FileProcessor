package com.fp.solution2;

import com.fp.Constants;

import java.io.BufferedWriter;
import java.nio.file.Files;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static java.nio.file.StandardOpenOption.APPEND;
import static java.nio.file.StandardOpenOption.CREATE;

public class WorkExecutors {

    ExecutorService AExecutor = Executors.newFixedThreadPool(1);
    ExecutorService BExecutor = Executors.newFixedThreadPool(1);
    ExecutorService CExecutor = Executors.newFixedThreadPool(1);
    ExecutorService DExecutor = Executors.newFixedThreadPool(1);
    ExecutorService EExecutor = Executors.newFixedThreadPool(1);
    ExecutorService FExecutor = Executors.newFixedThreadPool(1);
    ExecutorService GExecutor = Executors.newFixedThreadPool(1);
    ExecutorService HExecutor = Executors.newFixedThreadPool(1);
    ExecutorService IExecutor = Executors.newFixedThreadPool(1);
    ExecutorService JExecutor = Executors.newFixedThreadPool(1);
    ExecutorService KExecutor = Executors.newFixedThreadPool(1);
    ExecutorService LExecutor = Executors.newFixedThreadPool(1);
    ExecutorService MExecutor = Executors.newFixedThreadPool(1);
    ExecutorService NExecutor = Executors.newFixedThreadPool(1);
    ExecutorService OExecutor = Executors.newFixedThreadPool(1);
    ExecutorService PExecutor = Executors.newFixedThreadPool(1);
    ExecutorService QExecutor = Executors.newFixedThreadPool(1);
    ExecutorService RExecutor = Executors.newFixedThreadPool(1);
    ExecutorService SExecutor = Executors.newFixedThreadPool(1);
    ExecutorService TExecutor = Executors.newFixedThreadPool(1);
    ExecutorService UExecutor = Executors.newFixedThreadPool(1);
    ExecutorService VExecutor = Executors.newFixedThreadPool(1);
    ExecutorService WExecutor = Executors.newFixedThreadPool(1);
    ExecutorService XExecutor = Executors.newFixedThreadPool(1);
    ExecutorService YExecutor = Executors.newFixedThreadPool(1);
    ExecutorService ZExecutor = Executors.newFixedThreadPool(1);
    ExecutorService Executor0 = Executors.newFixedThreadPool(1);
    ExecutorService Executor1 = Executors.newFixedThreadPool(1);
    ExecutorService Executor2 = Executors.newFixedThreadPool(1);
    ExecutorService Executor3 = Executors.newFixedThreadPool(1);
    ExecutorService Executor4 = Executors.newFixedThreadPool(1);
    ExecutorService Executor5 = Executors.newFixedThreadPool(1);
    ExecutorService Executor6 = Executors.newFixedThreadPool(1);
    ExecutorService Executor7 = Executors.newFixedThreadPool(1);
    ExecutorService Executor8 = Executors.newFixedThreadPool(1);
    ExecutorService Executor9 = Executors.newFixedThreadPool(1);
    ExecutorService SpecialExecutor = Executors.newFixedThreadPool(1);

    WorkExecutors(){
        start();
        System.out.println("Successfully initialized all workers");
    }


    public void start(){
        AExecutor.submit(() -> {
                while(true){
                    if(!QueueManager.Aq.isEmpty()) {
                        Message message = QueueManager.Aq.poll();
                        try(BufferedWriter writer = Files.newBufferedWriter(message.getFilePath(), Constants.CHAR_SET,CREATE,APPEND)){
                        writer.write(message.getToken());
                        writer.newLine();
                    }
                }
            }
        });

        BExecutor.submit(() -> {
            while(true){
                if(!QueueManager.Bq.isEmpty()) {
                    Message message = QueueManager.Bq.poll();
                    try(BufferedWriter writer = Files.newBufferedWriter(message.getFilePath(), Constants.CHAR_SET,CREATE,APPEND)){
                        writer.write(message.getToken());
                        writer.newLine();
                    }
                }
            }
        });

        CExecutor.submit(() -> {
            while(true){
                if(!QueueManager.Cq.isEmpty()) {
                    Message message = QueueManager.Cq.poll();
                    try(BufferedWriter writer = Files.newBufferedWriter(message.getFilePath(), Constants.CHAR_SET,CREATE,APPEND)){
                        writer.write(message.getToken());
                        writer.newLine();
                    }
                }
            }
        });

        DExecutor.submit(() -> {
            while(true){
                if(!QueueManager.Dq.isEmpty()) {
                    Message message = QueueManager.Dq.poll();
                    try(BufferedWriter writer = Files.newBufferedWriter(message.getFilePath(), Constants.CHAR_SET,CREATE,APPEND)){
                        writer.write(message.getToken());
                        writer.newLine();
                    }
                }
            }
        });

        EExecutor.submit(() -> {
            while(true){
                if(!QueueManager.Eq.isEmpty()) {
                    Message message = QueueManager.Eq.poll();
                    try(BufferedWriter writer = Files.newBufferedWriter(message.getFilePath(), Constants.CHAR_SET,CREATE,APPEND)){
                        writer.write(message.getToken());
                        writer.newLine();
                    }
                }
            }
        });

        FExecutor.submit(() -> {
            while(true){
                if(!QueueManager.Fq.isEmpty()) {
                    Message message = QueueManager.Fq.poll();
                    try(BufferedWriter writer = Files.newBufferedWriter(message.getFilePath(), Constants.CHAR_SET,CREATE,APPEND)){
                        writer.write(message.getToken());
                        writer.newLine();
                    }
                }
            }
        });

        GExecutor.submit(() -> {
            while(true){
                if(!QueueManager.Gq.isEmpty()) {
                    Message message = QueueManager.Gq.poll();
                    try(BufferedWriter writer = Files.newBufferedWriter(message.getFilePath(), Constants.CHAR_SET,CREATE,APPEND)){
                        writer.write(message.getToken());
                        writer.newLine();
                    }
                }
            }
        });

        HExecutor.submit(() -> {
            while(true){
                if(!QueueManager.Hq.isEmpty()) {
                    Message message = QueueManager.Hq.poll();
                    try(BufferedWriter writer = Files.newBufferedWriter(message.getFilePath(), Constants.CHAR_SET,CREATE,APPEND)){
                        writer.write(message.getToken());
                        writer.newLine();
                    }
                }
            }
        });

        IExecutor.submit(() -> {
            while(true){
                if(!QueueManager.Iq.isEmpty()) {
                    Message message = QueueManager.Iq.poll();
                    try(BufferedWriter writer = Files.newBufferedWriter(message.getFilePath(), Constants.CHAR_SET,CREATE,APPEND)){
                        writer.write(message.getToken());
                        writer.newLine();
                    }
                }
            }
        });

        JExecutor.submit(() -> {
            while(true){
                if(!QueueManager.Jq.isEmpty()) {
                    Message message = QueueManager.Jq.poll();
                    try(BufferedWriter writer = Files.newBufferedWriter(message.getFilePath(), Constants.CHAR_SET,CREATE,APPEND)){
                        writer.write(message.getToken());
                        writer.newLine();
                    }
                }
            }
        });

        KExecutor.submit(() -> {
            while(true){
                if(!QueueManager.Kq.isEmpty()) {
                    Message message = QueueManager.Kq.poll();
                    try(BufferedWriter writer = Files.newBufferedWriter(message.getFilePath(), Constants.CHAR_SET,CREATE,APPEND)){
                        writer.write(message.getToken());
                        writer.newLine();
                    }
                }
            }
        });

        LExecutor.submit(() -> {
            while(true){
                if(!QueueManager.Lq.isEmpty()) {
                    Message message = QueueManager.Lq.poll();
                    try(BufferedWriter writer = Files.newBufferedWriter(message.getFilePath(), Constants.CHAR_SET,CREATE,APPEND)){
                        writer.write(message.getToken());
                        writer.newLine();
                    }
                }
            }
        });

        MExecutor.submit(() -> {
            while(true){
                if(!QueueManager.Mq.isEmpty()) {
                    Message message = QueueManager.Mq.poll();
                    try(BufferedWriter writer = Files.newBufferedWriter(message.getFilePath(), Constants.CHAR_SET,CREATE,APPEND)){
                        writer.write(message.getToken());
                        writer.newLine();
                    }
                }
            }
        });

        NExecutor.submit(() -> {
            while(true){
                if(!QueueManager.Nq.isEmpty()) {
                    Message message = QueueManager.Nq.poll();
                    try(BufferedWriter writer = Files.newBufferedWriter(message.getFilePath(), Constants.CHAR_SET,CREATE,APPEND)){
                        writer.write(message.getToken());
                        writer.newLine();
                    }
                }
            }
        });

        OExecutor.submit(() -> {
            while(true){
                if(!QueueManager.Oq.isEmpty()) {
                    Message message = QueueManager.Oq.poll();
                    try(BufferedWriter writer = Files.newBufferedWriter(message.getFilePath(), Constants.CHAR_SET,CREATE,APPEND)){
                        writer.write(message.getToken());
                        writer.newLine();
                    }
                }
            }
        });

        PExecutor.submit(() -> {
            while(true){
                if(!QueueManager.Pq.isEmpty()) {
                    Message message = QueueManager.Pq.poll();
                    try(BufferedWriter writer = Files.newBufferedWriter(message.getFilePath(), Constants.CHAR_SET,CREATE,APPEND)){
                        writer.write(message.getToken());
                        writer.newLine();
                    }
                }
            }
        });

        QExecutor.submit(() -> {
            while(true){
                if(!QueueManager.Qq.isEmpty()) {
                    Message message = QueueManager.Qq.poll();
                    try(BufferedWriter writer = Files.newBufferedWriter(message.getFilePath(), Constants.CHAR_SET,CREATE,APPEND)){
                        writer.write(message.getToken());
                        writer.newLine();
                    }
                }
            }
        });



        RExecutor.submit(() -> {
            while(true){
                if(!QueueManager.Rq.isEmpty()) {
                    Message message = QueueManager.Rq.poll();
                    try(BufferedWriter writer = Files.newBufferedWriter(message.getFilePath(), Constants.CHAR_SET,CREATE,APPEND)){
                        writer.write(message.getToken());
                        writer.newLine();
                    }
                }
            }
        });

        SExecutor.submit(() -> {
            while(true){
                if(!QueueManager.Sq.isEmpty()) {
                    Message message = QueueManager.Sq.poll();
                    try(BufferedWriter writer = Files.newBufferedWriter(message.getFilePath(), Constants.CHAR_SET,CREATE,APPEND)){
                        writer.write(message.getToken());
                        writer.newLine();
                    }
                }
            }
        });

        TExecutor.submit(() -> {
            while(true){
                if(!QueueManager.Tq.isEmpty()) {
                    Message message = QueueManager.Tq.poll();
                    try(BufferedWriter writer = Files.newBufferedWriter(message.getFilePath(), Constants.CHAR_SET,CREATE,APPEND)){
                        writer.write(message.getToken());
                        writer.newLine();
                    }
                }
            }
        });

        UExecutor.submit(() -> {
            while(true){
                if(!QueueManager.Uq.isEmpty()) {
                    Message message = QueueManager.Uq.poll();
                    try(BufferedWriter writer = Files.newBufferedWriter(message.getFilePath(), Constants.CHAR_SET,CREATE,APPEND)){
                        writer.write(message.getToken());
                        writer.newLine();
                    }
                }
            }
        });

        VExecutor.submit(() -> {
            while(true){
                if(!QueueManager.Vq.isEmpty()) {
                    Message message = QueueManager.Vq.poll();
                    try(BufferedWriter writer = Files.newBufferedWriter(message.getFilePath(), Constants.CHAR_SET,CREATE,APPEND)){
                        writer.write(message.getToken());
                        writer.newLine();
                    }
                }
            }
        });

        WExecutor.submit(() -> {
            while(true){
                if(!QueueManager.Wq.isEmpty()) {
                    Message message = QueueManager.Wq.poll();
                    try(BufferedWriter writer = Files.newBufferedWriter(message.getFilePath(), Constants.CHAR_SET,CREATE,APPEND)){
                        writer.write(message.getToken());
                        writer.newLine();
                    }
                }
            }
        });

        XExecutor.submit(() -> {
            while(true){
                if(!QueueManager.Xq.isEmpty()) {
                    Message message = QueueManager.Xq.poll();
                    try(BufferedWriter writer = Files.newBufferedWriter(message.getFilePath(), Constants.CHAR_SET,CREATE,APPEND)){
                        writer.write(message.getToken());
                        writer.newLine();
                    }
                }
            }
        });

        YExecutor.submit(() -> {
            while(true){
                if(!QueueManager.Yq.isEmpty()) {
                    Message message = QueueManager.Yq.poll();
                    try(BufferedWriter writer = Files.newBufferedWriter(message.getFilePath(), Constants.CHAR_SET,CREATE,APPEND)){
                        writer.write(message.getToken());
                        writer.newLine();
                    }
                }
            }
        });

        ZExecutor.submit(() -> {
            while(true){
                if(!QueueManager.Zq.isEmpty()) {
                    Message message = QueueManager.Zq.poll();
                    try(BufferedWriter writer = Files.newBufferedWriter(message.getFilePath(), Constants.CHAR_SET,CREATE,APPEND)){
                        writer.write(message.getToken());
                        writer.newLine();
                    }
                }
            }
        });

        Executor0.submit(() -> {
            while(true){
                if(!QueueManager.Q0.isEmpty()) {
                    Message message = QueueManager.Q0.poll();
                    try(BufferedWriter writer = Files.newBufferedWriter(message.getFilePath(), Constants.CHAR_SET,CREATE,APPEND)){
                        writer.write(message.getToken());
                        writer.newLine();
                    }
                }
            }
        });

        Executor1.submit(() -> {
            while(true){
                if(!QueueManager.Q1.isEmpty()) {
                    Message message = QueueManager.Q1.poll();
                    try(BufferedWriter writer = Files.newBufferedWriter(message.getFilePath(), Constants.CHAR_SET,CREATE,APPEND)){
                        writer.write(message.getToken());
                        writer.newLine();
                    }
                }
            }
        });

        Executor2.submit(() -> {
            while(true){
                if(!QueueManager.Q2.isEmpty()) {
                    Message message = QueueManager.Q2.poll();
                    try(BufferedWriter writer = Files.newBufferedWriter(message.getFilePath(), Constants.CHAR_SET,CREATE,APPEND)){
                        writer.write(message.getToken());
                        writer.newLine();
                    }
                }
            }
        });

        Executor3.submit(() -> {
            while(true){
                if(!QueueManager.Q3.isEmpty()) {
                    Message message = QueueManager.Q3.poll();
                    try(BufferedWriter writer = Files.newBufferedWriter(message.getFilePath(), Constants.CHAR_SET,CREATE,APPEND)){
                        writer.write(message.getToken());
                        writer.newLine();
                    }
                }
            }
        });

        Executor4.submit(() -> {
            while(true){
                if(!QueueManager.Q4.isEmpty()) {
                    Message message = QueueManager.Q4.poll();
                    try(BufferedWriter writer = Files.newBufferedWriter(message.getFilePath(), Constants.CHAR_SET,CREATE,APPEND)){
                        writer.write(message.getToken());
                        writer.newLine();
                    }
                }
            }
        });

        Executor5.submit(() -> {
            while(true){
                if(!QueueManager.Q5.isEmpty()) {
                    Message message = QueueManager.Q5.poll();
                    try(BufferedWriter writer = Files.newBufferedWriter(message.getFilePath(), Constants.CHAR_SET,CREATE,APPEND)){
                        writer.write(message.getToken());
                        writer.newLine();
                    }
                }
            }
        });

        Executor6.submit(() -> {
            while(true){
                if(!QueueManager.Q6.isEmpty()) {
                    Message message = QueueManager.Q6.poll();
                    try(BufferedWriter writer = Files.newBufferedWriter(message.getFilePath(), Constants.CHAR_SET,CREATE,APPEND)){
                        writer.write(message.getToken());
                        writer.newLine();
                    }
                }
            }
        });

        Executor7.submit(() -> {
            while(true){
                if(!QueueManager.Q7.isEmpty()) {
                    Message message = QueueManager.Q7.poll();
                    try(BufferedWriter writer = Files.newBufferedWriter(message.getFilePath(), Constants.CHAR_SET,CREATE,APPEND)){
                        writer.write(message.getToken());
                        writer.newLine();
                    }
                }
            }
        });

        Executor8.submit(() -> {
            while(true){
                if(!QueueManager.Q8.isEmpty()) {
                    Message message = QueueManager.Q8.poll();
                    try(BufferedWriter writer = Files.newBufferedWriter(message.getFilePath(), Constants.CHAR_SET,CREATE,APPEND)){
                        writer.write(message.getToken());
                        writer.newLine();
                    }
                }
            }
        });

        Executor9.submit(() -> {
            while(true){
                if(!QueueManager.Q9.isEmpty()) {
                    Message message = QueueManager.Q9.poll();
                    try(BufferedWriter writer = Files.newBufferedWriter(message.getFilePath(), Constants.CHAR_SET,CREATE,APPEND)){
                        writer.write(message.getToken());
                        writer.newLine();
                    }
                }
            }
        });

        SpecialExecutor.submit(() -> {
            while(true){
                if(!QueueManager.SPECIALQ.isEmpty()) {
                    Message message = QueueManager.SPECIALQ.poll();
                    try(BufferedWriter writer = Files.newBufferedWriter(message.getFilePath(), Constants.CHAR_SET,CREATE,APPEND)){
                        writer.write(message.getToken());
                        writer.newLine();
                    }
                }
            }
        });
    }

    public void shutdown(){
        AExecutor.shutdown();
        BExecutor.shutdown();
        CExecutor.shutdown();
        DExecutor.shutdown();
        EExecutor.shutdown();
        FExecutor.shutdown();
        GExecutor.shutdown();
         HExecutor.shutdown();
         IExecutor.shutdown();
         JExecutor.shutdown();
         KExecutor.shutdown();
         LExecutor.shutdown();
         MExecutor.shutdown();
         NExecutor.shutdown();
         OExecutor.shutdown();
         PExecutor.shutdown();
         QExecutor.shutdown();
         RExecutor.shutdown();
         SExecutor.shutdown();
         TExecutor.shutdown();
         UExecutor.shutdown();
         VExecutor.shutdown();
         WExecutor.shutdown();
         XExecutor.shutdown();
         YExecutor.shutdown();
         ZExecutor.shutdown();
         Executor0.shutdown();
         Executor1.shutdown();
         Executor2.shutdown();
         Executor3.shutdown();
         Executor4.shutdown();
         Executor5.shutdown();
         Executor6.shutdown();
         Executor7.shutdown();
         Executor8.shutdown();
         Executor9.shutdown();
         SpecialExecutor.shutdown();

        System.out.println("All workers have been gracefully shutdown.");
    }



}
