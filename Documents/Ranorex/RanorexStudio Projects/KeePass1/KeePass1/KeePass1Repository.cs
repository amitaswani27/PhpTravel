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
using System.Drawing;
using Ranorex;
using Ranorex.Core;
using Ranorex.Core.Repository;
using Ranorex.Core.Testing;

namespace KeePass1
{
#pragma warning disable 0436 //(CS0436) The type 'type' in 'assembly' conflicts with the imported type 'type2' in 'assembly'. Using the type defined in 'assembly'.
    /// <summary>
    /// The class representing the KeePass1Repository element repository.
    /// </summary>
    [System.CodeDom.Compiler.GeneratedCode("Ranorex", "7.2")]
    [RepositoryFolder("9b74829e-2d24-4ff7-8868-354b06f58a56")]
    public partial class KeePass1Repository : RepoGenBaseFolder
    {
        static KeePass1Repository instance = new KeePass1Repository();

        /// <summary>
        /// Gets the singleton class instance representing the KeePass1Repository element repository.
        /// </summary>
        [RepositoryFolder("9b74829e-2d24-4ff7-8868-354b06f58a56")]
        public static KeePass1Repository Instance
        {
            get { return instance; }
        }

        /// <summary>
        /// Repository class constructor.
        /// </summary>
        public KeePass1Repository() 
            : base("KeePass1Repository", "/", null, 0, false, "9b74829e-2d24-4ff7-8868-354b06f58a56", ".\\RepositoryImages\\KeePass1Repository9b74829e.rximgres")
        {
        }

#region Variables

#endregion

        /// <summary>
        /// The Self item info.
        /// </summary>
        [RepositoryItemInfo("9b74829e-2d24-4ff7-8868-354b06f58a56")]
        public virtual RepoItemInfo SelfInfo
        {
            get
            {
                return _selfInfo;
            }
        }
    }

    /// <summary>
    /// Inner folder classes.
    /// </summary>
    [System.CodeDom.Compiler.GeneratedCode("Ranorex", "7.2")]
    public partial class KeePass1RepositoryFolders
    {
    }
#pragma warning restore 0436
}