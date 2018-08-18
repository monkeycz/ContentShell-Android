
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/tcp_socket.mojom
//

package org.chromium.network.mojom;

import org.chromium.mojo.bindings.DeserializationException;


public interface TcpConnectedSocket extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends TcpConnectedSocket, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<TcpConnectedSocket, TcpConnectedSocket.Proxy> MANAGER = TcpConnectedSocket_Internal.MANAGER;


    void upgradeToTls(
HostPortPair hostPortPair, TlsClientSocketOptions options, MutableNetworkTrafficAnnotationTag trafficAnnotation, org.chromium.mojo.bindings.InterfaceRequest<TlsClientSocket> request, SocketObserver observer, 
UpgradeToTlsResponse callback);

    interface UpgradeToTlsResponse extends org.chromium.mojo.bindings.Callbacks.Callback3<Integer, org.chromium.mojo.system.DataPipe.ConsumerHandle, org.chromium.mojo.system.DataPipe.ProducerHandle> { }



    void setNoDelay(
boolean noDelay, 
SetNoDelayResponse callback);

    interface SetNoDelayResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<Boolean> { }



    void setKeepAlive(
boolean enable, int delaySecs, 
SetKeepAliveResponse callback);

    interface SetKeepAliveResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<Boolean> { }


}
