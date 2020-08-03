package org.apache.lucene.demo;

import org.apache.lucene.search.similarities.ClassicSimilarity;
import java.lang.Math;

public final class CMPT456Similarity extends ClassicSimilarity {
    public CMPT456Similarity() {
        super();
    }

    @Override
    public float tf(float freq) {
        float k = 1 + freq;
        return (float) Math.pow(k, 0.5);
    }

    @Override
    public float idf(long docFreq, long docCount) {
        return 1 + (float)Math.log((docCount + 2) / (double)(docFreq + 2));
    }
}