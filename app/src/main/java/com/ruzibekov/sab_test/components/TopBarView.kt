package com.ruzibekov.sab_test.components

import androidx.annotation.StringRes
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.ruzibekov.sab_test.R

@Composable
fun TopBarView(@StringRes titleRes: Int) {
    Text(
        text = stringResource(titleRes),
    )
}

@Preview
@Composable
private fun TopBarPreview() {
    TopBarView(
        titleRes = R.string.my_addresses
    )
}