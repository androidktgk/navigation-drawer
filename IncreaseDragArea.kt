drawerLayout.setOnTouchListener { _, event ->
            if (event.rawX < 400 && !drawerLayout.isDrawerOpen(GravityCompat.START)) {
                drawerLayout.openDrawer(GravityCompat.START)
                return@setOnTouchListener true
            }
            false
        }