drawerLayout.addDrawerListener(object : DrawerLayout.DrawerListener {
            override fun onDrawerSlide(drawerView: View, slideOffset: Float) {
  
                val deviceWidth=resources.displayMetrics.widthPixels
                binding.mainContent.translationX= 0.80f*deviceWidth
            }

            override fun onDrawerOpened(drawerView: View) {
                // Drawer opened callback
            }

            override fun onDrawerClosed(drawerView: View) {
                binding.mainContent.translationX=0f
            }

            override fun onDrawerStateChanged(newState: Int) {
                // Drawer state changed callback
            }
        })



