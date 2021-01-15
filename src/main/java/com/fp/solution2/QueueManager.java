package com.fp.solution2;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class QueueManager {

    public static Queue<Message> Aq = new ConcurrentLinkedQueue<Message>();
    public static Queue<Message> Bq = new ConcurrentLinkedQueue<Message>();
    public static Queue<Message> Cq = new ConcurrentLinkedQueue<Message>();
    public static Queue<Message> Dq = new ConcurrentLinkedQueue<Message>();
    public static Queue<Message> Eq = new ConcurrentLinkedQueue<Message>();
    public static Queue<Message> Fq = new ConcurrentLinkedQueue<Message>();
    public static Queue<Message> Gq = new ConcurrentLinkedQueue<Message>();
    public static Queue<Message> Hq = new ConcurrentLinkedQueue<Message>();
    public static Queue<Message> Iq = new ConcurrentLinkedQueue<Message>();
    public static Queue<Message> Jq = new ConcurrentLinkedQueue<Message>();
    public static Queue<Message> Kq = new ConcurrentLinkedQueue<Message>();
    public static Queue<Message> Lq = new ConcurrentLinkedQueue<Message>();
    public static Queue<Message> Mq = new ConcurrentLinkedQueue<Message>();
    public static Queue<Message> Nq = new ConcurrentLinkedQueue<Message>();
    public static Queue<Message> Oq = new ConcurrentLinkedQueue<Message>();
    public static Queue<Message> Pq = new ConcurrentLinkedQueue<Message>();
    public static Queue<Message> Qq = new ConcurrentLinkedQueue<Message>();
    public static Queue<Message> Rq = new ConcurrentLinkedQueue<Message>();
    public static Queue<Message> Sq = new ConcurrentLinkedQueue<Message>();
    public static Queue<Message> Tq = new ConcurrentLinkedQueue<Message>();
    public static Queue<Message> Uq = new ConcurrentLinkedQueue<Message>();
    public static Queue<Message> Vq = new ConcurrentLinkedQueue<Message>();
    public static Queue<Message> Wq = new ConcurrentLinkedQueue<Message>();
    public static Queue<Message> Xq = new ConcurrentLinkedQueue<Message>();
    public static Queue<Message> Yq = new ConcurrentLinkedQueue<Message>();
    public static Queue<Message> Zq = new ConcurrentLinkedQueue<Message>();
    public static Queue<Message> Q0 = new ConcurrentLinkedQueue<Message>();
    public static Queue<Message> Q1 = new ConcurrentLinkedQueue<Message>();
    public static Queue<Message> Q2 = new ConcurrentLinkedQueue<Message>();
    public static Queue<Message> Q3 = new ConcurrentLinkedQueue<Message>();
    public static Queue<Message> Q4 = new ConcurrentLinkedQueue<Message>();
    public static Queue<Message> Q5 = new ConcurrentLinkedQueue<Message>();
    public static Queue<Message> Q6 = new ConcurrentLinkedQueue<Message>();
    public static Queue<Message> Q7 = new ConcurrentLinkedQueue<Message>();
    public static Queue<Message> Q8 = new ConcurrentLinkedQueue<Message>();
    public static Queue<Message> Q9 = new ConcurrentLinkedQueue<Message>();
    public static Queue<Message> SPECIALQ = new ConcurrentLinkedQueue<Message>();

    public static boolean isQEmpty(){
        while(true){
            if(Aq.isEmpty() && Bq.isEmpty() && Cq.isEmpty() && Dq.isEmpty() && Eq.isEmpty() && Fq.isEmpty()
                    && Gq.isEmpty() && Hq.isEmpty() && Iq.isEmpty() & Jq.isEmpty() && Kq.isEmpty() && Lq.isEmpty()
                    && Mq.isEmpty() && Nq.isEmpty() && Oq.isEmpty() && Pq.isEmpty() && Qq.isEmpty() && Rq.isEmpty() && Sq.isEmpty()
                    && Tq.isEmpty() && Uq.isEmpty() && Vq.isEmpty() && Wq.isEmpty() && Xq.isEmpty() && Yq.isEmpty() && Zq.isEmpty()
                    && Q0.isEmpty() && Q1.isEmpty() && Q3.isEmpty() && Q4.isEmpty() && Q5.isEmpty() && Q2.isEmpty() && Q6.isEmpty()
                    && Q7.isEmpty() && Q8.isEmpty() && Q9.isEmpty() && SPECIALQ.isEmpty()){
                return true;
            }
        }
    }
}
