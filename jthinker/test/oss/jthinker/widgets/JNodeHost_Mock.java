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

package oss.jthinker.widgets;

import oss.jthinker.graphs.NodeBundle_Mock;

/**
 * Minimalistic mock-emulator for JNodeHost interface.
 * 
 * @author iappel
 */
public class JNodeHost_Mock implements JNodeHost {
    private final GroupHandler groupHandler = new GroupHandler(new
            JBackgroundPane(), new NodeBundle_Mock<JNode>());
    
    public void deleteJNode(JNode node) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void editJNodeContent(JNode node) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void endLinking(JNode end) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void startLinking(JNode start) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void enableNodeNumbering(boolean state) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int issueIndex(JNode node) {
        return 0;
    }

    public void dispatchJNodeMove(JNode node) {
    }

    public GroupHandler getGroupHandler() {
        return groupHandler;
    }

    public JNode add(JNodeSpec nodeSpec) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void remove(JNode... nodes) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
