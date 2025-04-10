package com.ruzibekov.sab_test.components

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ruzibekov.sab_test.R
import com.ruzibekov.sab_test.ui.theme.SAB_TestTheme

@Composable
fun TopBarView(@StringRes titleRes: Int) {
    Surface(
        shape = RoundedCornerShape(bottomStart = 8.dp, bottomEnd = 8.dp),
        shadowElevation = 1.dp
    ) {
        Text(
            text = stringResource(titleRes),
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 18.dp, bottom = 15.dp),
            style = MaterialTheme.typography.labelMedium,
            textAlign = TextAlign.Center
        )
    }
}

@Preview
@Composable
private fun TopBarPreview() {
    SAB_TestTheme {
        TopBarView(
            titleRes = R.string.my_addresses
        )
    }
}