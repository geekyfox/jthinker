/*
 * Copyright (c) 2010, Ivan Appel <ivan.appel@gmail.com>
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


package oss.jthinker.datamodel;

import java.util.ArrayList;
import java.util.List;

class DummyDiagramDataSource implements DiagramDataSource {
    private final DiagramType diagramType;
    private final List<JNodeData> nodeData = new ArrayList<JNodeData>();
    private final List<JEdgeData> edgeData = new ArrayList<JEdgeData>();
    private final List<JLegData> legData = new ArrayList<JLegData>();

    private DiagramOptionData options;

    public DummyDiagramDataSource(DiagramType diagramType) {
        this.diagramType = diagramType;
    }

    public List<JNodeData> getNodeData() {
        return nodeData;
    }

    public List<JEdgeData> getEdgeData() {
        return edgeData;
    }

    public List<JLegData> getLegData() {
        return legData;
    }

    public void add(JNodeData node) {
        nodeData.add(node);
    }

    public void add(JEdgeData edge) {
        edgeData.add(edge);
    }

    public void add(JLegData leg) {
        legData.add(leg);
    }

    public void set(DiagramOptionData options) {
        this.options = options;
    }

    public DiagramOptionData getOptions() {
        return options;
    }

    public DiagramType getDiagramType() {
        return diagramType;
    }
}
