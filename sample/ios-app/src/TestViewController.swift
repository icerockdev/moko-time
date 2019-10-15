/*
 * Copyright 2019 IceRock MAG Inc. Use of this source code is governed by the Apache 2.0 license.
 */

import UIKit
import MultiPlatformLibrary

class TestViewController: UIViewController {
    
    private let timeTest = TimeTest()
    
    @IBAction func onStartPressed() {
        timeTest.start()
    }
    
    @IBAction func onStopPressed() {
        timeTest.stop()
    }
}
