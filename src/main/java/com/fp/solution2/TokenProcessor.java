package com.fp.solution2;

import com.fp.FileDictionary;

public class TokenProcessor {


    public void process(String token){
       // System.out.println("~"+token+"~");
        String firstCharactor = String.valueOf(token.charAt(0)).toUpperCase();

        switch(firstCharactor){
            case "A":
                QueueManager.Aq.offer(new Message(token, FileDictionary.getFilePath(firstCharactor)));
                break;

            case "B":
                QueueManager.Bq.offer(new Message(token, FileDictionary.getFilePath(firstCharactor)));
                break;

            case "C":
                QueueManager.Cq.offer(new Message(token, FileDictionary.getFilePath(firstCharactor)));
                break;

            case "D":
                QueueManager.Dq.offer(new Message(token, FileDictionary.getFilePath(firstCharactor)));
                break;

            case "E":
                QueueManager.Eq.offer(new Message(token, FileDictionary.getFilePath(firstCharactor)));
                break;

            case "F":
                QueueManager.Fq.offer(new Message(token, FileDictionary.getFilePath(firstCharactor)));
                break;

            case "G":
                QueueManager.Gq.offer(new Message(token, FileDictionary.getFilePath(firstCharactor)));
                break;

            case "H":
                QueueManager.Hq.offer(new Message(token, FileDictionary.getFilePath(firstCharactor)));
                break;

            case "I":
                QueueManager.Iq.offer(new Message(token, FileDictionary.getFilePath(firstCharactor)));
                break;

            case "J":
                QueueManager.Jq.offer(new Message(token, FileDictionary.getFilePath(firstCharactor)));
                break;

            case "K":
                QueueManager.Kq.offer(new Message(token, FileDictionary.getFilePath(firstCharactor)));
                break;

            case "L":
                QueueManager.Lq.offer(new Message(token, FileDictionary.getFilePath(firstCharactor)));
                break;

            case "M":
                QueueManager.Mq.offer(new Message(token, FileDictionary.getFilePath(firstCharactor)));
                break;

            case "N":
                QueueManager.Nq.offer(new Message(token, FileDictionary.getFilePath(firstCharactor)));
                break;

            case "O":
                QueueManager.Oq.offer(new Message(token, FileDictionary.getFilePath(firstCharactor)));
                break;

            case "P":
                QueueManager.Pq.offer(new Message(token, FileDictionary.getFilePath(firstCharactor)));
                break;

            case "Q":
                QueueManager.Qq.offer(new Message(token, FileDictionary.getFilePath(firstCharactor)));
                break;

            case "R":
                QueueManager.Rq.offer(new Message(token, FileDictionary.getFilePath(firstCharactor)));
                break;

            case "S":
                QueueManager.Sq.offer(new Message(token, FileDictionary.getFilePath(firstCharactor)));
                break;

            case "T":
                QueueManager.Tq.offer(new Message(token, FileDictionary.getFilePath(firstCharactor)));
                break;

            case "U":
                QueueManager.Uq.offer(new Message(token, FileDictionary.getFilePath(firstCharactor)));
                break;

            case "V":
                QueueManager.Vq.offer(new Message(token, FileDictionary.getFilePath(firstCharactor)));
                break;

            case "W":
                QueueManager.Wq.offer(new Message(token, FileDictionary.getFilePath(firstCharactor)));
                break;

            case "X":
                QueueManager.Xq.offer(new Message(token, FileDictionary.getFilePath(firstCharactor)));
                break;

            case "Y":
                QueueManager.Yq.offer(new Message(token, FileDictionary.getFilePath(firstCharactor)));
                break;

            case "Z":
                QueueManager.Zq.offer(new Message(token, FileDictionary.getFilePath(firstCharactor)));
                break;

            case "0":
                QueueManager.Q0.offer(new Message(token, FileDictionary.getFilePath(firstCharactor)));
                break;

            case "1":
                QueueManager.Q1.offer(new Message(token, FileDictionary.getFilePath(firstCharactor)));
                break;

            case "2":
                QueueManager.Q2.offer(new Message(token, FileDictionary.getFilePath(firstCharactor)));
                break;

            case "3":
                QueueManager.Q3.offer(new Message(token, FileDictionary.getFilePath(firstCharactor)));
                break;

            case "4":
                QueueManager.Q4.offer(new Message(token, FileDictionary.getFilePath(firstCharactor)));
                break;

            case "5":
                QueueManager.Q5.offer(new Message(token, FileDictionary.getFilePath(firstCharactor)));
                break;

            case "6":
                QueueManager.Q6.offer(new Message(token, FileDictionary.getFilePath(firstCharactor)));
                break;

            case "7":
                QueueManager.Q7.offer(new Message(token, FileDictionary.getFilePath(firstCharactor)));
                break;

            case "8":
                QueueManager.Q8.offer(new Message(token, FileDictionary.getFilePath(firstCharactor)));
                break;

            case "9":
                QueueManager.Q9.offer(new Message(token, FileDictionary.getFilePath(firstCharactor)));
                break;

            default:
                QueueManager.SPECIALQ.offer(new Message(token, FileDictionary.getFilePath(firstCharactor)));
                break;
        }

    }
}
