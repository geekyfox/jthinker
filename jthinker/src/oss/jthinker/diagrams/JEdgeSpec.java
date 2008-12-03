/*
 * Copyright (c) 2008, Ivan Appel <ivan.appel@gmail.com>
 * 
 * All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 * 
 * - Redistributions of source code must retain the above copyright notice,
 * this list of conditions and the following disclaimer. 
 * - Redistributions in binary form must reproduce the above copyright notice,
 * this list of conditions and the following disclaimer in the documentation
 * and/or other materials provided with the distribution. 
 *
 * Neither the name of Ivan Appel nor the names of any other jThinker
 * contributors may be used to endorse or promote products derived from this
 * software without specific prior written permission. 
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
 * IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS;
 * OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
 * WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR
 * OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
 * ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package oss.jthinker.diagrams;

/**
 * Saveable presentation of the edge on diagram.
 * 
 * @author iappel
 */
public class JEdgeSpec {
    public final int idxA;
    public final int idxZ;
    public final boolean conflict;
    
    /**
     * Creates a new JEdgeSpec instance.
     * 
     * @param idxA index of edge's start node
     * @param idxZ index of edge's end node
     * @param conflict true if line is "conflict-shaped"
     */
    public JEdgeSpec(int idxA, int idxZ, boolean conflict) {
        this.idxA = idxA;
        this.idxZ = idxZ;
        this.conflict = conflict;
    }
    
    @Override
    /** {@inheritDoc} */
    public boolean equals(Object obj) {
        if (obj instanceof JEdgeSpec) {
            JEdgeSpec edgeSpec = (JEdgeSpec)obj;
            return (edgeSpec.idxA == idxA) && (edgeSpec.idxZ == idxZ);
        } else {
            return super.equals(obj);
        }
    }

    @Override
    /** {@inheritDoc} */
    public int hashCode() {
        return idxA + 42 * idxZ;
    }    
}