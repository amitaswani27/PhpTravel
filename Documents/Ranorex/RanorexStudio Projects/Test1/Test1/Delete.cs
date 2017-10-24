﻿///////////////////////////////////////////////////////////////////////////////
//
// This file was automatically generated by RANOREX.
// DO NOT MODIFY THIS FILE! It is regenerated by the designer.
// All your modifications will be lost!
// http://www.ranorex.com
//
///////////////////////////////////////////////////////////////////////////////

using System;
using System.Collections.Generic;
using System.Text;
using System.Text.RegularExpressions;
using System.Drawing;
using System.Threading;
using WinForms = System.Windows.Forms;

using Ranorex;
using Ranorex.Core;
using Ranorex.Core.Testing;
using Ranorex.Core.Repository;

namespace Test1
{
#pragma warning disable 0436 //(CS0436) The type 'type' in 'assembly' conflicts with the imported type 'type2' in 'assembly'. Using the type defined in 'assembly'.
    /// <summary>
    ///The Delete recording.
    /// </summary>
    [TestModule("25f7c90e-f614-4926-9f2d-fadc672cd53b", ModuleType.Recording, 1)]
    public partial class Delete : ITestModule
    {
        /// <summary>
        /// Holds an instance of the Test1Repository repository.
        /// </summary>
        public static Test1Repository repo = Test1Repository.Instance;

        static Delete instance = new Delete();

        /// <summary>
        /// Constructs a new instance.
        /// </summary>
        public Delete()
        {
        }

        /// <summary>
        /// Gets a static instance of this recording.
        /// </summary>
        public static Delete Instance
        {
            get { return instance; }
        }

#region Variables

#endregion

        /// <summary>
        /// Starts the replay of the static recording <see cref="Instance"/>.
        /// </summary>
        [System.CodeDom.Compiler.GeneratedCode("Ranorex", "7.2")]
        public static void Start()
        {
            TestModuleRunner.Run(Instance);
        }

        /// <summary>
        /// Performs the playback of actions in this recording.
        /// </summary>
        /// <remarks>You should not call this method directly, instead pass the module
        /// instance to the <see cref="TestModuleRunner.Run(ITestModule)"/> method
        /// that will in turn invoke this method.</remarks>
        [System.CodeDom.Compiler.GeneratedCode("Ranorex", "7.2")]
        void ITestModule.Run()
        {
            Mouse.DefaultMoveTime = 300;
            Keyboard.DefaultKeyPressTime = 100;
            Delay.SpeedFactor = 1.00;

            Init();

            Report.Log(ReportLevel.Info, "Mouse", "Mouse Right Click item 'MainForm.Project1' at 60;14.", repo.MainForm.Project1Info, new RecordItemIndex(0));
            repo.MainForm.Project1.Click(System.Windows.Forms.MouseButtons.Right, "60;14");
            Delay.Milliseconds(200);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'MCtxPwList.DeleteEntry' at 77;10.", repo.MCtxPwList.DeleteEntryInfo, new RecordItemIndex(1));
            repo.MCtxPwList.DeleteEntry.Click("77;10");
            Delay.Milliseconds(200);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'KeePass.ButtonDelete' at 46;12.", repo.KeePass.ButtonDeleteInfo, new RecordItemIndex(2));
            repo.KeePass.ButtonDelete.Click("46;12");
            Delay.Milliseconds(200);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'MainForm.Save' at 7;13.", repo.MainForm.SaveInfo, new RecordItemIndex(3));
            repo.MainForm.Save.Click("7;13");
            Delay.Milliseconds(200);
            
        }

#region Image Feature Data
#endregion
    }
#pragma warning restore 0436
}